package _javadoc;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * Created by USER on 17.12.2016, 10:38.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">(e-mail: gamaliev-vadim@yandex.com)</a>
 * @version 1.0
 */
public class TestDrive {

    /**
     * It is id count, automatic increment by 1, when object is create.
     *
     * @see         AtomicInteger AtomicInteger
     * @see         AtomicInteger#incrementAndGet() incrementAndGet()
     * @since       1.8
     */
    private final static AtomicInteger ID_COUNT;

//    /**
//     * static initialization
//     *
//     * @see this this
//     */
    static {
        ID_COUNT = new AtomicInteger();
    }

    /**
     * Increment ID_COUNT by 1, and get new id
     *
     * @param   name set name to new id, if available.
     * @return  new id.
     * @throws  NumberFormatException if chto-nibud' cluchilos..
     * @throws  NullPointerException  esli beda kakaya-to...
     * @see     AtomicInteger atomic..
     * @since   1.8
     */
    public int getNewId(String name) {
        return ID_COUNT.incrementAndGet();
    }
}
