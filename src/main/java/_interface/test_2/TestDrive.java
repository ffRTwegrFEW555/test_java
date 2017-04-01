package _interface.test_2;

/**
 * Created by USER on 01.04.2017, 23:20.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {

    public static void main(String[] args) {
        TestDrive.NewClass        one = new TestDrive().new NewClass();     // #1
        TestDrive.NewStaticClass  two = new TestDrive.NewStaticClass();
        TestDrive.Interface       thr = new TestDrive.Interface() {         // #2 work. Interface as static?
            @Override
            public String toString() {
                return super.toString();
            }
        };

    }

    public class NewClass {}

    public static class NewStaticClass {}

    public interface Interface {}
}
