package main.java.com.ttn.mehak.Java8Assignment;

//Create and access default and static method of an interface.

interface Stringer{
    default String concatenator(String a, String b){
        return a.concat(b);
    }

    static  String upperCaseMaker(String a){
        return a.toUpperCase();
    }
}

public class Question6 implements Stringer{
    public static void main(String[] args) {
        String uppercase= Stringer.upperCaseMaker("mehak adlakha");  //static method access
        System.out.println(uppercase);

        Question6 question6 = new Question6();
        String concated = question6.concatenator("Hello ","TTN");   //default method access
        System.out.println(concated);
    }
}
