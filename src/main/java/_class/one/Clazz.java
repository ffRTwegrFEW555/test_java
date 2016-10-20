package _class.one;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by Vad on 25.06.2016.
 */
public class Clazz {
    public static void main(String[] args) {

        //
        Class aClass = Integer.class;
        System.out.println(aClass);
        System.out.println(aClass.getSimpleName());
        System.out.println(aClass.getClass());
        System.out.println(aClass.getName());
        System.out.println(aClass.getCanonicalName());
        System.out.println(Arrays.toString(aClass.getInterfaces()));
        System.out.println(Arrays.toString(aClass.getFields()));
        System.out.println(Arrays.toString(aClass.getDeclaredFields()));
        System.out.println(Arrays.toString(aClass.getConstructors()));
        System.out.println(aClass.getEnclosingMethod());

        //
        // и так далее..

        //
        System.out.println("");
        System.out.println("==================================");
        System.out.println("");

        //
        Cat cat = new Cat(1);
        System.out.println(Arrays.toString(cat.getClass().getFields()));
        System.out.println("");
        System.out.println(Arrays.toString(cat.getClass().getDeclaredFields()));
        System.out.println("");
        System.out.println(Arrays.toString(cat.getClass().getConstructors()));
        System.out.println("");
        System.out.println(Arrays.toString(cat.getClass().getMethods()));
        System.out.println("");
        System.out.println(Arrays.toString(cat.getClass().getDeclaredMethods()));

        //
        System.out.println("");
        System.out.println("==================================");
        System.out.println("");

        //
        Class classCat = cat.getClass();

        //
        Field[] fieldsCat = classCat.getFields();
        Field fieldCat = null;
        try {
            fieldCat = classCat.getField("a2");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        System.out.println("");
        System.out.println("==== get Fields");
        System.out.println("");

        for(Field field : fieldsCat) {
            System.out.println(field);
        }
        System.out.println("");
        System.out.println(fieldCat);

        //
        Method[] methodsCat = cat.getClass().getMethods();
        Method methodCat = null;
        try {
            methodCat = cat.getClass().getMethod("Move");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        System.out.println("");
        System.out.println("==== get Methods");
        System.out.println("");
        for(Method method : methodsCat) {
            System.out.println(method);
        }

        System.out.println("");
        System.out.println(methodCat);

        //
        System.out.println("");
        System.out.println("==================================");
        System.out.println("");

        //
        try {
            String s = String.class.newInstance();
            Method m = String.class.getMethod("length");
            int length = (int) m.invoke(s);

            System.out.println(length);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
