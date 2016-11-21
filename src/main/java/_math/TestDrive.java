package _math;

/**
 * Created on 19.11.2016, 13:48.
 *
 * @author Vadim Gamaliev <gamaliev-vadim@yandex.com>
 * @version 1.0
 */
public class TestDrive {
    public static void main(String[] args) {

        // to calculate a distance and angles to dot
        double a = 10.0;
        double b = 20.0;

        double diagonal = Math.sqrt((a * a + b * b)); // расстояние от центра до точки
        System.out.println("diagonal: " + diagonal);

        double cosA = a/diagonal;
        System.out.println("cosA: " + cosA);

        double angleARadians = Math.acos(cosA);
        double angleADegrees = Math.toDegrees(angleARadians);
        System.out.println("angleA: " + angleADegrees);

        System.out.println("angleB: " + (180 - 90 - angleADegrees));
        System.out.println("angleC: 90");

    }
}
