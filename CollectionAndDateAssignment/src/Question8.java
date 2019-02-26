import java.text.SimpleDateFormat;
import java.util.Date;

//Write a program to format date as example "21-March-2016"

public class Question8 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MMMMM-yyyy");
        Date date = new Date();
        System.out.println(format.format(date));
    }
}
