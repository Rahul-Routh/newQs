package NewQuestion;

import java.util.Scanner;

public class Qs8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number = ");
        int n=sc.nextInt();

            if(n==1 || n==0){
                System.out.println("NO it is not prime");
            }else {
                int count = 0;
                for (int i = 2; i <= n; i++) {
                    if (n % i == 0)
                        count++;
                }
                if (count == 1) {
                    System.out.println("YES it is prime number");
                } else {
                    System.out.println("NO it is not prime number");
                }
            }
    }
}
