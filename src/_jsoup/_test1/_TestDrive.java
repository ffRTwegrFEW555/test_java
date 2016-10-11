package _jsoup._test1;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by USER on 11.10.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        String htmlLink = "http://v-vannu.ru/section-tumbyi-dlya-vannoj/";
        Document html = null;

        try {
            html = Jsoup.connect(htmlLink).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("URL: "      + html.baseUri());
        System.out.println("Title: "    + html.title());
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
            System.out.println(link.text());
        }
        System.out.println();

        // Pages
        Elements linksPagesJ = content.select("a[href^=?&page=].b-link");
        for (Element link : linksPagesJ) {
            System.out.println(link.attr("abs:href"));
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
            String image            = element.select("img[src$=.jpg]").first().attr("abs:src");
            Element available       = element.select("a.product-cluster__title").first();
            String vendorCode       = element.select("div.product-cluster__code").first().text();
            String name             = available.text();
            String link             = available.attr("abs:href");
            String price            = element.select("div.product-cluster__price").first().text().replaceAll(" ", "");

            ProductCardCatalog pcc = new ProductCardCatalog(
                marketingStatus == null ? 0 : 1,
                available.className().contains("product-cluster__title--in-stock") ? 1 : 3,
                image,
                vendorCode,
                name,
                link,
                Integer.parseInt(price));

            Element attributes      = element.select("div.product-cluster__attributes").first();
            if (attributes != null) {
                Elements attributesToMap = attributes.children();
                for (Element e : attributesToMap) {
                    String spanValue = e.children().text();
                    String eText = e.text();
                    pcc.putProperties(eText.substring(0, eText.length() - spanValue.length()), spanValue);
                }
            }

            productCardCatalogs.add(pcc);
        }

        productCardCatalogs.forEach(System.out::println);
    }
}
