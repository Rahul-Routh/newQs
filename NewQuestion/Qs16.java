package NewQuestion;

import java.util.Scanner;

public class Qs16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index length = ");
        int n=sc.nextInt();
        int[] arr = new int[n] ;
        System.out.println("Enter array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int temp = 0, first, second;
        int index1 = 0 , index2 = 0;
        int j , k ;

        System.out.println("Before the swap: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        System.out.println("Enter the first number  swap = ");
        first = sc.nextInt();
        System.out.println("Enter the second number swap = ");
        second = sc.nextInt();

        for(k = 0 ; k < n; k++){
            if(arr[k] == first)
                index1 = k;
        }
        for(j = 0 ; j < n; j++){
            if(arr[j] == second)
                index2 = j;
        }
        temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        System.out.println("After the swap:");
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
