package _exception._exception_3;

/**
 * Created by Vad on 07.07.2016.
 */
public class TestDrive {

    public static void main(String[] args) {

        //
        try (AutoCloseableClass autoCloseableClass = new AutoCloseableClass())
        {
            throw new NewException();
        }
        catch (NewException ne) {
            System.out.println("Inner NewException catch text");
            System.out.println(ne.getMessage());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                throw new NewRuntimeException("Finally block");
            } catch (NewRuntimeException nre) {
                System.out.println("Finally block catches");
                System.out.println(nre.getMessage());
            }
        }

        //
        try {
            throw new NewError("NewError");
        } catch (NewError ne){
            System.out.println(ne.getMessage());
        }
    }

}
