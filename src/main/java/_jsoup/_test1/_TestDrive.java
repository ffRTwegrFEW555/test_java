package _jsoup._test1;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * Created by USER on 11.10.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        String htmlLink = "http://v-"
                + "va"
                + "nnu."
                + "ru"
                + "/section-tumbyi-dlya-vannoj/";
        Document html = null;

        try {
            Connection con = Jsoup.connect(htmlLink);

            // =======================
            con.userAgent("Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/53.0.2785.143 Safari/537.36");
            con.timeout(10000);
            con.referrer("https://localhost/");
            // =======================

            html = con.get();
            // or: html = Jsoup.connect(htmlLink).get();
            // (.get == .method(Connection.Method.GET).execute())
            // (.post == .method(Connection.Method.POST).execute())

            // ==============
            System.out.println(con.response().statusCode());
            System.out.println(con.response().statusMessage());
            System.out.println();

            Connection.Response response500 = null;
            try {
                response500 = Jsoup.connect(htmlLink + "?&page=400").method(Connection.Method.GET).execute();
                System.out.println(response500.statusCode());
                System.out.println(response500.statusMessage());
            } catch (HttpStatusException e) {
                System.out.println("Exception. Response status=" + e.getStatusCode());
            } finally {
                System.out.println();
            }

            Connection.Response response404 = null;
            try {
                response404 = Jsoup.connect(htmlLink + "e/").method(Connection.Method.GET).execute();
                System.out.println(response404.statusCode());
                System.out.println(response404.statusMessage());
            } catch (HttpStatusException e) {
                System.out.println("Exception. Response status=" + e.getStatusCode());
            } finally {
                System.out.println();
            }
            // ==============

            // ==================================================================
            Map<String, String> reqCookies = con.request().cookies();
            if (reqCookies.size() == 0) {
                System.out.println(".request().cookies().size() == 0");
            }
            for (Map.Entry pair : reqCookies.entrySet()) {
                System.out.println(pair.getKey() + "    " + pair.getValue());
            }
            System.out.println();

            //
            Map<String, String> testRequestHeaders = con.request().headers();
            for (Map.Entry pair : testRequestHeaders.entrySet()) {
                System.out.println(pair.getKey() + "    " + pair.getValue());
            }
            System.out.println();

            //
            Map<String, String> testResponseHeaders = con.response().headers();
            for (Map.Entry pair : testResponseHeaders.entrySet()) {
                System.out.println(pair.getKey() + "    " + pair.getValue());
            }
            System.out.println();

            //
            Map<String, String> resCookies = con.response().cookies();
            for (Map.Entry pair : resCookies.entrySet()) {
                System.out.println(pair.getKey() + "    " + pair.getValue());
            }
            // Далее эти куки можно использовать в запросах, либо устанавливать свои,
            // либо сохранить и потом восстановить где-нибудь.
            System.out.println();

            // again #1
            reqCookies = con.request().cookies();
            if (reqCookies.size() == 0) {
                System.out.println(".request().cookies().size() == 0");
            }
            for (Map.Entry pair : reqCookies.entrySet()) {
                System.out.println(pair.getKey() + "    " + pair.getValue());
            }
            System.out.println();
            // Jsoup куки не сохраняет, необходимо вручную вставлять

            // again #2
            con.request().cookie("csrftokenn", "HwprjeYJ360kJUWTKkmZ8AoqQ63Q18TuDD");
            con.cookies(resCookies);
            reqCookies = con.request().cookies();
            if (reqCookies.size() == 0) {
                System.out.println(".request().cookies().size() == 0");
            }
            for (Map.Entry pair : reqCookies.entrySet()) {
                System.out.println(pair.getKey() + "    " + pair.getValue());
            }
            System.out.println();
            // Jsoup куки не сохраняет, необходимо вручную вставлять
            // ==================================================================

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("URL: " + html.baseUri());
        System.out.println("Title: " + html.title());
        System.out.println();

        Element content = html.getElementsByClass("b-container__product-list").first();

        /*
            Parse links
        */
        System.out.println("Links: ");
        System.out.println();

        // Products
        Elements linksProductsJ = content.select("a[href^=/product].product-cluster__title");
        for (Element link : linksProductsJ) {
            System.out.println(link.attr("abs:href"));
            // or: System.out.println(link.absUrl("href"));
            System.out.println(link.text());
        }
        System.out.println();

        // Pages
        Elements linksPagesJ = content.select("a[href^=?&page=].b-link");
        for (Element link : linksPagesJ) {
            System.out.println(link.attr("abs:href"));
            // or: System.out.println(link.absUrl("href"));
            System.out.println(link.text());
        }
        System.out.println();

        // Parse arrow-link to next page
        Element linkToNextPage = content.select("li.b-pagination__arrow > a.b-link").first();
        System.out.println(linkToNextPage.attr("abs:href"));
        System.out.println(linkToNextPage.text());
        System.out.println();


        /*
            Parse #2
            Primary study
        */
        System.out.println("Product info: ");
        System.out.println();

        ArrayList<ProductCardCatalog> productCardCatalogs = new ArrayList<>();

        Elements products = content.select("div.product-cluster");
        for (Element element : products) {
            Element marketingStatus = element.select("div.product-cluster__marker").first();
            Element image = element.select("img[src$=.jpg]").first();
            Element available = element.select("a.product-cluster__title").first();
            Element vendorCode = element.select("div.product-cluster__code").first();
            Element price = element.select("div.product-cluster__price").first();

            ProductCardCatalog pcc = new ProductCardCatalog(
                    marketingStatus == null ? 0 : 1,
                    available == null ? 0 : available.classNames().contains("product-cluster__title--in-stock") ? 1 : 3,
                    image == null ? "" : image.attr("abs:src"),
                    vendorCode == null ? "" : vendorCode.text(),
                    available == null ? "" : available.text(),
                    available == null ? "" : available.attr("abs:href"),
                    price == null ? 0 : Integer.parseInt(price.text().replaceAll(" ", "")));

            Element attributes = element.select("div.product-cluster__attributes").first();
            if (attributes != null) {
                Elements attributesToMap = attributes.children();
                for (Element e : attributesToMap) {
                    String eText = e.ownText();
                    /*
                        <div class="product-cluster__attribute">Страна: <span>Россия</span></div>
                        .text() == "Страна: Россия";
                        .ownText() == "Страна: ";
                     */

                    String spanValue = e.children().text();
                    if (eText == null || eText.equals("") || eText.equals(": ")) {
                        continue;
                    } else if (spanValue == null || spanValue.equals("")) {
                        pcc.putProperties(eText, "");
                    } else {
                        pcc.putProperties(eText, spanValue);
                    }
                }
            }

            productCardCatalogs.add(pcc);
        }

        productCardCatalogs.forEach(System.out::println);

        // TODO: check for null; add support xlsx, sqlite, mysql, javaFX, Swing, + executable file.
    }
}
