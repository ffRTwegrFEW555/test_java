package _stream.flat;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created on 21.11.2016, 20:08.
 *
 * @author Vadim Gamaliev <gamaliev-vadim@yandex.com>
 * @version 1.0
 */
public class Car {
    private String model;
    private List<Detail> details;

    public Car(String model) {
        details = new ArrayList<>();
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public Stream<Detail> getDetailsStream() {
        return details.stream();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", details=" + details +
                '}';
    }
}

