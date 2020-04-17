package NewQuestion;

import java.util.Scanner;

public class Patten3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n = sc.nextInt();

        if (n >= 4) {
            System.out.println("@");
            for (int i = 1; i < n - 1; i++) {
                for (int j = 1; j <= 2; j++) {

                    System.out.print("@ ");
                    for (int k = 2; k <= i; k++) {
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }
            for (int i = 1; i <= n - 1; i++) {
                System.out.print("@ ");
            }
        } else {
            System.out.println("Not elegible");
        }
    }
    }
