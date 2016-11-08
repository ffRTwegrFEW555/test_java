package _refactor;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by USER on 30.09.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        System.out.println(3 % 2);

    }

    public void test1() {
        mergeCode();
    }

    private void mergeCode() {
        System.out.println();
        System.out.println();
        // Used Ctrl + Alt + M -- merged same code from two diff methods
    }

    public void test2() {
        mergeCode();
    }
}
