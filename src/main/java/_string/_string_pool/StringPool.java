package _string._string_pool;

/**
 * http://www.javaspecialist.ru/2011/05/javalangstring.html
 */
public class StringPool {
    public static void main(String[] args) {
        String x = "java";
        String x2 = new String("java");
        String x3 = "jav";
        String x4 = x3 + 'a';
        String x5 = "jav" + 'a';
        System.out.println(x == x2);
        System.out.println(x == x4);
        System.out.println(x == x2.intern());
        System.out.println(x == x4.intern());
        System.out.println(x == x5);
    }
}
