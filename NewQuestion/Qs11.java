package NewQuestion;

import java.util.Scanner;

public class Qs11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number = ");
        int n=sc.nextInt();
        int count =0,temp=0,temp1=0;

        System.out.println("Prime number are = ");
        for(int i=1;i<=n;i++){
            if(i==1) {
                continue;
            }else{
                for(int j=2;j<=i;j++){
                    if(i%j==0)
                        count++;

                }
            }
            if(count==1){
                temp++;
                System.out.println(i);
                temp1=i;
            }
            count=0;
        }
        System.out.println("Total number of prime number are: "+temp);
        System.out.println("Largest prime number is: "+temp1);
    }
}
