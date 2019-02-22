package sessionpart2;

//Create a custom exception that do not have any stack trace.
public class Question13 {
    public static void function1() throws Exception{
        throw new Exception("This is thrown from function1()");
    }

    public static void function2() throws Throwable{
        try{
            function1();
        } catch (Exception e) {
            System.err.println("Inside function2()");
            throw e.fillInStackTrace(); //no output is shown
        }
    }

    public static void main(String[] args) throws Throwable{
        try{
            function2();
        } catch (Exception e) {
            System.err.println("Inside main");
            e.printStackTrace(); //shows diff between printtacktrace and fillinstacktrace
        }
    }
}
