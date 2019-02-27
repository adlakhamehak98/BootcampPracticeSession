package main.java.com.ttn.mehak.sessionpart2;

//WAP showing try, multi-catch and finally blocks.
public class Question6 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            System.out.println(a[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs"); //Exceptions in terms of heirarchy
        }
        finally {
            System.out.println("Finally block");   //finally block
        }
        System.out.println("rest of the code");
    }
}
