package _clone;

import java.util.ArrayList;

/**
 * Created by Vad on 09.07.2016.
 */
public class Cat extends Feline implements Cloneable{
    private String name;
    private int age;
    private TempObject tempObject;
    private ArrayList<TempObject> tempObjectArrayList;

    public Cat(String name, int age, String breed, String size) {
        this.name = name;
        this.age = age;
        setBreed(breed);
        setSize(size);
        tempObject = new TempObject();
        tempObjectArrayList = new ArrayList<>();
        tempObjectArrayList.add(new TempObject());
        tempObjectArrayList.add(new TempObject());
    }

    public void setTempObject(TempObject tempObject) {
        this.tempObject = tempObject;
    }

    public void setTempObjectArrayList(ArrayList<TempObject> tempObjectArrayList) {
        this.tempObjectArrayList = tempObjectArrayList;
    }

    public ArrayList<TempObject> getTempObjectArrayList() {
        return tempObjectArrayList;
    }

    @Override
    public String toString() {
        return "Cat: "
                + name + ", "
                + age + ", "
                + getBreed() + ", "
                + getSize() + " \n("
                + tempObject + ") \n("
                + tempObjectArrayList.get(0) + ") \n("
                + tempObjectArrayList.get(1) + ")";
    }

    //  Default
    //
    //  @Override
    //  protected Object clone() throws CloneNotSupportedException {
    //      return super.clone();
    //  }

    @Override
    protected Cat clone() throws CloneNotSupportedException {
        return (Cat) super.clone();
    }

    protected Cat cloneNew() {
        Cat catNew = new Cat(this.name,
                             this.age,
                             getBreed(),
                             getSize());
        ArrayList<TempObject> tempObjects = new ArrayList<>();
        tempObjects.add(new TempObject());
        tempObjects.add(new TempObject());

        catNew.setTempObject(new TempObject());
        catNew.setTempObjectArrayList(tempObjects);

        return catNew;
    }
}
