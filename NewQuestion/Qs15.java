package NewQuestion;

import java.util.Scanner;

public class Qs15 {
    public static void main(String[] args) {
        int a,b,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter array length = ");
         a=sc.nextInt();
        int arr[]=new int[a];

        for(i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter value number ");
        b=sc.nextInt();
        int arr2[]=new int[a];
        for(i=0;i<a;i++){
            if(b==arr[i])
                System.out.println("index number is = " + i);
            }
    }
}
