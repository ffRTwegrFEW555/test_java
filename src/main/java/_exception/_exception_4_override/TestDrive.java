package _exception._exception_4_override;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLTransactionRollbackException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by USER on 27.01.2017, 18:48.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {

    // http://www.quizful.net/interview/java/redefine-(override)-method
    // http://www.quizful.net/post/java-exceptions

    class A {
        protected Collection execute(String myparam) throws IOException {
            return null;
        }
    }

    class B extends A {
        @Override
        public Queue execute(String arg) throws FileNotFoundException /*, SQLException */ {
            return null;
        }
    }

    class C extends B {
        @Override
        public LinkedList execute(String arg) {
            return null;
        }
    }

    class D extends C {
        @Override
        public LinkedList execute(String arg) throws RuntimeException {
            return null;
        }
    }

}
