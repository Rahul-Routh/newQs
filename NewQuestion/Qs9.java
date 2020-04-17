package NewQuestion;

import java.util.Scanner;

public class Qs9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num=sc.nextInt();

        int temp=1,count=0;

        do{
            temp=num / 10;
            num=temp;
            count++;
        }
        while(temp>=1);
        System.out.println("Number of digits is "+count);

    }
}
