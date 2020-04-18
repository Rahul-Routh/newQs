package NewQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class Qs14 {
    public static void main(String[] args) {
        int j = 0,temp;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println("Invalid Input");
            return;
        }
            int arr[] = new int[n];
            int i;
            for (i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            sc.close();
            for (i = 0; i < n; i++) {
                for (int k = i + 1; k < n; k++) {
                    if (arr[i] > arr[k]) {
                        temp = arr[i];
                        arr[i] = arr[k];
                        arr[k] = temp;
                    }
                }
            }
        System.out.println("Second Largest:"+arr[n-2]);
        System.out.println("Second Smallest:"+arr[1]);
    }
}
