package _big_decimal;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by USER on 18.10.2016.
 */
public class _TestDrive {
    public static void main(String[] args) {
        System.out.println(BigDecimal.ONE);
        System.out.println(BigInteger.TEN);

        System.out.println(getValue(1.1d, 1.2d));
    }

    public static BigDecimal getValue(double v1, double v2) {
        return new BigDecimal(v1).add(new BigDecimal(v2));
    }
}
