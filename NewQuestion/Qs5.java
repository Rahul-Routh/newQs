package NewQuestion;

import java.util.Scanner;

public class Qs5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base = ");
        int base =sc.nextInt();
        System.out.print("Enter power = ");
        int power=sc.nextInt();

        int temp=1,i=1;
        do{
            temp *=base;

            i++;
        }while(i<=power);
        System.out.println(temp);
    }
}
