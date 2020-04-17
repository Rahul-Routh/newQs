package NewQuestion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Qs12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("How many prime number = ");
        int n = sc.nextInt();
        if (n>0) {
            int count = 0, temp = 0, temp1 = 0;
            System.out.println("Prime number are = ");
            for (int i = 1; i <= 100; i++) {
                if (i == 1) {
                    continue;
                } else {
                    for (int j = 2; j <= i; j++) {
                        if (i % j == 0)
                            count++;

                    }
                }
                if (count == 1) {
                    temp++;
                    System.out.print(i + "\t");
                    temp1 = i;
                }
                count = 0;
                if (n == temp) {
                    break;
                }
            }
        }else{
            System.out.println("Negative input not allow ");
        }
    }
}
