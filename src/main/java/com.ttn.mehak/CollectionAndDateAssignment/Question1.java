package main.java.com.ttn.mehak.CollectionAndDateAssignment;
//Write Java code to define List .
// Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question1 {

    public static void main(String[] args) {
        List<Float> list = new ArrayList<>(); //creating arraylist
        list.add(1.0f);//adding objects to list
        list.add(160f);
        list.add(100f);
        list.add(120f);
        list.add(19f);
        System.out.println("List elements:");

        //Traversing list through Iterator
        Iterator itr = list.iterator();
        float sum = 0;
        int i = 0;
        while (itr.hasNext()) {
            System.out.println(itr.next());
            sum = sum + list.get(i); //sum of elements in sum variable
            i++;
        }
        System.out.println("Sum: ");
        System.out.println(sum);
    }
}
