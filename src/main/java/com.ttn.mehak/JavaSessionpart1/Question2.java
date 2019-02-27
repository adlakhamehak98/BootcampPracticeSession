package main.java.com.ttn.mehak.JavaSessionpart1;

//Write a program to find the number of occurrences of the duplicate words in a string and print them ?
public class Question2 {
    public static void main(String[] args) {
        String duplstr = "Welcome to Java session which is a good session where Java is taught";
        String words[] = duplstr.split(" ");
        int wordcount = 1;
        for (int i = 0; i < words.length; i++)        //Outer loop for Comparison
        {
            for (int j = i + 1; j < words.length; j++)    //Inner loop for Comparison
            {

                if (words[i].equals(words[j]))    //Checking for both strings are equal
                {
                    wordcount = wordcount + 1;                //if equal increment the count
                    words[j] = "0";            //Replace repeated words by zero
                }
            }
            if (words[i] != "0" && wordcount > 1)
                System.out.println(words[i] + "--" + wordcount);    //Printing the duplicate words along with count
            wordcount = 1;

        }
    }
}
