package _exception._exception_2;

/**
 * Created by Vad on 26.05.2016.
 */
public class Pencil {

    public Pencil (boolean sideHand) throws CatException, WorldException {
        writeByHand(sideHand);
    }

    public void writeByHand(boolean sideHand) throws CatException, WorldException {
        System.out.println("Write by..");

        if (sideHand) {
            System.out.println("left hand.");
            throw new WorldException();
        }
        else {
            System.out.println("right hand.");
            throw new CatException();
        }

    }
}
