package NewQuestion;

import java.util.Scanner;

public class Qs10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = 1, j = 0;
        while (j < k) {
            System.out.print("Enter Stating value = ");
            int first = sc.nextInt();
            System.out.print("End value = ");
            int last = sc.nextInt();

            for (int l = 0; l <= 2000; l++) {
                if (first >= last) {
                    System.out.println("please enter low to high number. Try again!!!!!");
                    k++;
                    break;
                } else {
                    k=1;
                    j++;
                    int temp = 0, temp1 = 1;
                    for (int i = (first + 1); i < last; i++) {
                        temp += i;

                        temp1 *= i;
                    }
                    System.out.println("sum of number " + temp);
                    System.out.println("Multiple of number " + temp1);
                break;
                }
            }
        }
    }
}
