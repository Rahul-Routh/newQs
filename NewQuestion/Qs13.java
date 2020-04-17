package NewQuestion;

import java.util.Scanner;

public class Qs13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array's length =");
        int x=sc.nextInt();
        int arr1[]=new int[x];
        int arr2[]=new int[x];
        System.out.println("Enter the first array = ");
        for(int i=0;i<x;i++){
              arr1[i]=sc.nextInt();
        }
        System.out.println("Enter second array = ");
        for(int i=0;i<x;i++){
            arr2[i]=sc.nextInt();
        }
        //int [] arr1={1,2,3,4,5,6,7};
        //int[] arr2={8,9,10,11,12,13,14};
        int n= arr1.length;
        int m=arr2.length;
        int [] arr3=new int [n+m];
        merge(arr1,arr2,arr3,n,m);
        System.out.println("Array after merging = ");
        for (int i=0;i<n+m;i++)
            System.out.print(arr3[i]+" ");
    }

    public static void merge(int[]arr1, int arr2[], int arr3[],int n,int m) {
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }
    }

}
