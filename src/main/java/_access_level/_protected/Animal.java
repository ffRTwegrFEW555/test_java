package _access_level._protected;

/**
 * Created by USER on 25.09.2016.
 */
public class Animal {
    public String one = "one";
    String two = "two";
    protected String three = "three";
    private String four = "four";

    public void one() {
        System.out.println(one);
    }

    void two() {
        System.out.println(two);
    }

    protected void three() {
        System.out.println(three);
    }

    private void four() {
        System.out.println(four);
    }

}
