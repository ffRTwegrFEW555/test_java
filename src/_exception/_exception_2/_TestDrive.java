package _exception._exception_2;

/**
 * Created by Vad on 26.05.2016.
 */
public class _TestDrive {

    //
    private boolean getSideHand() {
        return (Math.random() * 10) < 5;
    }

    // Разные исключения, но одинаковые операции.
    private void greatePencil() {
        try {
            new Pencil(getSideHand());
        } catch (CatException | WorldException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("");
        }
    }

    // Разные исключения и разные операции.
    private void greatePencilAnotherWay() {
        try {
            new Pencil(getSideHand());
        } catch (CatException e) {
            System.out.println("catch (CatException e)");
        } catch (WorldException e) {
            System.out.println("catch (WorldException e)");
        } finally {
            System.out.println("");
        }
    }

    // Полиморфизм.
    private void greatePencilTHREE() {
        try {
            new Pencil(getSideHand());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("");
        }
    }

    // Полиморфизм и отношения дочерние-родительские классы.
    private void greatePencilFOUR() {
        try {
            new Pencil(getSideHand());
        } catch (CatException e) { /* Для конктреного исключения */
            System.out.println("catch (CatException e)");
        } catch (Exception e) { /* Для всех остальных исключений */
            System.out.println(e.getMessage());
        } finally {
            System.out.println("");
        }
    }

    // Без блока "catch" -- 1
    private void greatePencilFIVE_One() {
        try {
            greatePencilFIVE_Two();
            System.out.println("after: greatePencilFIVE_Two();");
        } catch (CatException e) {
            System.out.println("catch (CatException e)");
        } catch (WorldException e) {
            System.out.println("catch (WorldException e)");
        } finally {
            System.out.println("finally: greatePencilFIVE_One()");
            System.out.println("");
        }
    }

    // Без блока "catch" -- 2
    private void greatePencilFIVE_Two() throws CatException, WorldException {
        try {
            new Pencil(getSideHand());
            System.out.println("after: new Pencil(getSideHand());"); /* Очень интересно можно использовать
                                                                        блоки "try/catch/finally" -
                                                                        - без "catch" */
        } finally {
            System.out.println("finally: greatePencilFIVE_Two()");
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++)
            new _TestDrive().greatePencil();

        System.out.println("/////////////////////////////////");
        for (int i = 0; i < 5; i++)
            new _TestDrive().greatePencilAnotherWay();

        System.out.println("/////////////////////////////////");
        for (int i = 0; i < 5; i++)
            new _TestDrive().greatePencilTHREE();

        System.out.println("/////////////////////////////////");
        for (int i = 0; i < 5; i++)
            new _TestDrive().greatePencilFOUR();

        System.out.println("/////////////////////////////////");
        for (int i = 0; i < 5; i++)
            new _TestDrive().greatePencilFIVE_One();
    }
}
