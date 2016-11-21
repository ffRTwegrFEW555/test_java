package _stream.flat;

/**
 * Created on 21.11.2016, 20:10.
 *
 * @author Vadim Gamaliev <gamaliev-vadim@yandex.com>
 * @version 1.0
 */
public class Detail {
    private String article;
    private String comment;

    public Detail(String article, String comment) {
        this.article = article;
        this.comment = comment;
    }

    public String getArticle() {
        return article;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return  "Detail{" +
                "article=" + article +
                ", comment=" + comment +
                "}";
    }
}
