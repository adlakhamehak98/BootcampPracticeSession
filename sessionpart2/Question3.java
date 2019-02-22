package sessionpart2;
//WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
public class Question3 {
    static class ErrorClass {
        static int arr = 1 / 0;
    }
    public static void main(String args[]) {
        try
        { //there is no class by this name
            Class.forName("NonExistingClass"); //producing ClassNotFoundException
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        try {
//          Here there will be an ExceptionInInitializerError as the class has an runtime ArithmeticException
//          So the class will not be created successfully
            new ErrorClass();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
//          As the class is not created it will give NoClassDefFoundError
            new ErrorClass();
        }
    }
}
