package NewQuestion;

import java.util.Scanner;

public class Qs17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of array = ");
        int length=sc.nextInt();
        int a[]=new int[length];
        int b[]=new int[length];
        System.out.println("Enter 1st array = ");
        for(int i=0;i<length;i++){
            a[i]=sc.nextInt();
        }

        System.out.println("Enter 2nd array = ");
        for(int i=0;i<length;i++){
            b[i]=sc.nextInt();
        }

        //int a[] = {1, 2, 3, 4, 5, 6};
        int n = a.length;
//        int b[] = {2, 3, 4, 5, 6, 7};
        int m = b.length;
        int arr[] = new int[n + m];
        marge(a, b, arr, n, m);
        System.out.println("Marge Array = ");
        for (int i = 0; i < n + m; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void marge(int a[], int b[], int arr[], int n, int m) {
        int k = 0;

        for (int i : a)
            arr[k++] = i;
        for (int i : b)
            arr[k++] = i;
    }
}
