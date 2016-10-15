package _inner_class._non_static;

/**
 * Created by USER on 21.09.2016.
 */
public class _TestDrive {

    public static void main(String[] args) {

        // non private
        Outer.Inner outerInner = new Outer().new Inner();
        System.out.println(outerInner.inner);
//        System.out.println(outerInner.innerPrivate);

//        System.out.println(outerInner.outer);
        System.out.println(outerInner.getOuter());

        // private
//        Outer.InnerPrivate outerInnerPrivate = new Outer().new InnerPrivate();
//        System.out.println(outerInnerPrivate.inner);
//        System.out.println(outerInnerPrivate.innerPrivate);
//
//        System.out.println(outerInnerPrivate.outer);
//        System.out.println(outerInnerPrivate.getOuter());
    }
}
