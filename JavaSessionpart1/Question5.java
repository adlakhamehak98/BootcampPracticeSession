package sessionpart1;

//Find common elements between two arrays.
public class Question5 {
    public static void main(String a[]) {
        int[] arr1 = {4, 7, 3, 9, 2};
        int[] arr2 = {3, 2, 12, 9, 40, 32, 4};
        System.out.println("Common elements: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) { //if common element found
                    System.out.println(arr1[i]);                                     ;
                }
            }
        }
    }
}