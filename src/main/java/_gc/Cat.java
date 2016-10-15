package _gc;

import java.util.ArrayList;

/**
 * Created by Vad on 10.07.2016.
 */
public class Cat {
    ArrayList<String> stringArrayList;
    ArrayList<Long> longArrayList;

    {
        stringArrayList = new ArrayList<>();
        for (int i = 0; i < 1_000; i++) {
            stringArrayList.add(String.valueOf(Math.random() * 123456789 + 123456789));
        }

        longArrayList = new ArrayList<>();
        for (int i = 0; i < 1_000; i++) {
            longArrayList.add((long) (Math.random() * 123456789 + 123456789));
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this + " destroy.");
        super.finalize();
    }
}
