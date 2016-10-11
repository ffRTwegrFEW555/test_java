package _jsoup._test1;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by USER on 11.10.2016.
 */
public class ProductCardCatalog {
    private int marketingStatus;    // 0. null, 1. sale, 2. write-down, 3. stock, 4. novelty, 5. gift certificates;
    private int available;         // 0. null, 1. available, 2. expected, 3. custom;

    private String image;
    private String vendorCode;
    private String name;
    private String link;

    private int price;

    private Map<NameProperties, String> properties;

    public ProductCardCatalog(int marketingStatus, int available, String image, String vendorCode, String name, String link, int price) {
        this.marketingStatus = marketingStatus;
        this.available = available;
        this.image = image;
        this.vendorCode = vendorCode;
        this.name = name;
        this.link = link;
        this.price = price;
        properties = new LinkedHashMap<>();
    }

    public void putProperties(String name, String value) {
        properties.put(new NameProperties(name), value);
    }

    private class NameProperties {
        private String name;

        public NameProperties(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "NameProperties{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "ProductCardCatalog{" +
                "marketingStatus=" + marketingStatus +
                ", available=" + available +
                ", image='" + image + '\'' +
                ", vendorCode='" + vendorCode + '\'' +
                ", name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", price=" + price +
                ", properties=" + properties +
                '}';
    }
}
