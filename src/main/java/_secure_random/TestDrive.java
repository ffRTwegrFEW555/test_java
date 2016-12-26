package _secure_random;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * Created by USER on 24.12.2016, 14:40.
 *
 * @author Vadim Gamaliev <a href="mailto:gamaliev-vadim@yandex.com">gamaliev-vadim@yandex.com</a>
 * @version 1.0
 */
public class TestDrive {

    public static void main(String[] args) {
        System.out.println(generateRandomString());
    }

    public static String generateRandomString() {
        SecureRandom secureRandom = new SecureRandom();
        System.out.println("Algorithm: " + secureRandom.getAlgorithm());
        return new BigInteger(130, secureRandom).toString(32);
    }
}
