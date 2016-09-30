package _inner_class._non_static;

/**
 * Created by USER on 21.09.2016.
 */
public class Outer {
    private String outer = "Jorik";

    class Inner {
        String inner = "Alkogolik";
        private String innerPrivate = "Alkogolik";

        public void setOuter() {
            outer = "new Jorik";
        }

        public String getOuter() {
            return outer;
        }
    }

    private class InnerPrivate {
        String inner = "Alkogolik";
        private String innerPrivate = "Alkogolik";

        public void setOuter() {
            outer = "new Jorik";
        }

        public String getOuter() {
            return outer;
        }
    }

    public void setInner() {
//        inner = "new Alkogolik";
//        innerPrivate = "new Alkogolik";
//        Inner.inner = "new Alkogolik";
//        Inner.innerPrivate = "new Alkogolik";
        new Inner().inner = "new Alkogolik";
        new Inner().innerPrivate = "new Alkogolik";
        new InnerPrivate().inner = "new Alkogolik";
        new InnerPrivate().innerPrivate = "new Alkogolik";
    }
}
