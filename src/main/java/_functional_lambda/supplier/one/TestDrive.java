package _functional_lambda.supplier.one;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;

/**
 * Created by USER on 17.11.2016, 21:32.
 */
public class TestDrive {
    public static void main(String[] args) {

        //
        Supplier<AtomicLong> atomicLongSupplier = AtomicLong::new;

        //
        System.out.println(
                atomicLongSupplier
                        .get()
                        .hashCode()
        );
        System.out.println(
                atomicLongSupplier
                        .get()
                        .hashCode()
        );
    }
}
