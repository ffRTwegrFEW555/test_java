package _inner_class._static;

/**
 * Created by USER on 25.09.2016.
 */
public class Outer {
    public String outer = "outer";
    private String outerPrivate = "outerPrivate";

    public static String outerStatic = "outerStatic";
    private static String outerPrivateStatic = "outerPrivateStatic";

    public static class Inner {
        public String inner = "inner";
        private String innerPrivate = "innerPrivate";

        public static String innerStatic = "innerStatic";
        private static String innerPrivateStatic = "innerPrivateStatic";

        public void change() {
//            outer = "oterNew";
//            outerPrivate = "outerPrivateNew";
            outerStatic = "outerStaticNew";
            outerPrivateStatic = "outerPrivateStaticNew";
        }

        public static void changeStatic() {
//            outer = "oterNew";
//            outerPrivate = "outerPrivateNew";
            outerStatic = "outerStaticNew";
            outerPrivateStatic = "outerPrivateStaticNew";
        }

        private void changePrivate() {
//            outer = "oterNew";
//            outerPrivate = "outerPrivateNew";
            outerStatic = "outerStaticNew";
            outerPrivateStatic = "outerPrivateStaticNew";
        }

        private static void changePrivateStatic() {
//            outer = "oterNew";
//            outerPrivate = "outerPrivateNew";
            outerStatic = "outerStaticNew";
            outerPrivateStatic = "outerPrivateStaticNew";
        }

        private void testInnerPrivateClass() {

            //
//            InnerPrivate.change();
            InnerPrivate.changeStatic();
//            InnerPrivate.changePrivate();
            InnerPrivate.changePrivateStatic();

            //
            new InnerPrivate().change();
            new InnerPrivate().changeStatic();
            new InnerPrivate().changePrivate();
            new InnerPrivate().changePrivateStatic();

            //
            new InnerPrivate().change();
            new InnerPrivate().changeStatic();
            new InnerPrivate().changePrivate();
            new InnerPrivate().changePrivateStatic();
        }
    }

    private static class InnerPrivate {
        public String inner = "inner";
        private String innerPrivate = "innerPrivate";

        public static String innerStatic = "innerStatic";
        private static String innerPrivateStatic = "innerPrivateStatic";

        public void change() {
//            outer = "oterNew";
//            outerPrivate = "outerPrivateNew";
            outerStatic = "outerStaticNew";
            outerPrivateStatic = "outerPrivateStaticNew";
        }

        public static void changeStatic() {
//            outer = "oterNew";
//            outerPrivate = "outerPrivateNew";
            outerStatic = "outerStaticNew";
            outerPrivateStatic = "outerPrivateStaticNew";
        }

        private void changePrivate() {
//            outer = "oterNew";
//            outerPrivate = "outerPrivateNew";
            outerStatic = "outerStaticNew";
            outerPrivateStatic = "outerPrivateStaticNew";
        }

        private static void changePrivateStatic() {
//            outer = "oterNew";
//            outerPrivate = "outerPrivateNew";
            outerStatic = "outerStaticNew";
            outerPrivateStatic = "outerPrivateStaticNew";
        }
    }
}
