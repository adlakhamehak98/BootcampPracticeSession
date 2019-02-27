package main.java.com.ttn.mehak.JavaSessionpart1;

// There is an array with every element repeated twice except one. Find that element
public class Question6 {
    static int nonRepeating(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j]) //checking if similar element found
                    break;
            if (j == n)
                return arr[i]; //return non repeating element
        }
        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {9, 9, 4, 5, 6, 6, 4, 3};
        int n = arr.length;

        System.out.print(nonRepeating(arr, n));
    }
}
