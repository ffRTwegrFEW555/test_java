package _inner_class.extendsInnerClass;

/**
 * Created by USER on 02.10.2016.
 */
public class ElectroCarDoor extends Car.Door {
    public ElectroCarDoor(Car car) {
        car.super();
    }

    public void printText() {
//        model = "model";
//        color = "color";
        modelDoor = "modelDoor";
//        modelColor = "modelColor";
    }
}
