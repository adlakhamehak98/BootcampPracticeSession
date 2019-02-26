import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

//Write a program to display times in different country format.
public class Question9 {
    public static void main(String[] args) {
//      Locale is a final class which means it can not be extended any other class.
//      This class contains details like country name along with there language etc.
//      DateFormat is an abstract class that is used for printing date in custom formats.
//      getAvailableLocales method returns all the available locales supported by java.
        for (Locale locale : DateFormat.getAvailableLocales()) {
//      getDateInstance method returns the date formatter with the given formatting style for the given locale.
            DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, locale);
//      format method is used to format the date as a string on the basis of specified pattern in simpleDateFormat
//      instance.
            System.out.println(dateFormat.format(new Date()));
        }
    }
}