package NewQuestion;

import java.util.Scanner;

public class Qs19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any world = ");
        String  ch=sc.nextLine();
        char []arr=ch.toCharArray();

        for(int i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                arr[i]='b';
            }else if(arr[i]=='b'){
                arr[i]='a';
            }else{
                arr[i]=arr[i];
            }
        }
        System.out.println("After changing a to b  and b to a: ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
