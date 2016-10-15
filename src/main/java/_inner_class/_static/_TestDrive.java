package _inner_class._static;

/**
 * Created by USER on 25.09.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {

        new _TestDrive().Action();
    }

    public void Action() {

        // ==========================================================================

        //
//        Outer.outer = "outer";
//        Outer.outerPrivate = "outerPrivate";
        Outer.outerStatic = "outerStatic";
//        Outer.outerPrivateStatic = "outerPrivateStatic";

        //
        new Outer().outer = "outer";
//        new Outer().outerPrivate = "outerPrivate";
        new Outer().outerStatic = "outerStatic";
//        new Outer().outerPrivateStatic = "outerPrivateStatic";

        //
//        Outer.Inner.inner = "inner";
//        Outer.Inner.innerPrivate = "innerPrivate";
        Outer.Inner.innerStatic = "innerStatic";
//        Outer.Inner.innerPrivateStatic = "innerPrivateStatic";

        //
        new Outer.Inner().inner = "inner";
//        new Outer.Inner().innerPrivate = "innerPrivate";
        new Outer.Inner().innerStatic = "innerStatic";
//        new Outer.Inner().innerPrivateStatic = "innerPrivateStatic";

        //
//        Outer.Inner.outer = "outer";
//        Outer.Inner.outerPrivate = "outerPrivate";
//        Outer.Inner.outerStatic = "outerStatic";
//        Outer.Inner.outerPrivateStatic = "outerPrivateStatic";

        //
//        new Outer.Inner().outer = "outer";
//        new Outer.Inner().outerPrivate = "outerPrivate";
//        new Outer.Inner().outerStatic = "outerStatic";
//        new Outer.Inner().outerPrivateStatic = "outerPrivateStatic";

        //
//        Outer.Inner.change();
        Outer.Inner.changeStatic();
//        Outer.Inner.changePrivate();
//        Outer.Inner.changePrivateStatic();

        //
        new Outer.Inner().change();
        new Outer.Inner().changeStatic();
//        new Outer.Inner().changePrivate();
//        new Outer.Inner().changePrivateStatic();

        // ==========================================================================

//        Outer.InnerPrivate.changeStatic();
        // ....
    }
}
