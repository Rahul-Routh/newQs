package NewQuestion;
import java.util.Scanner;

public class Qs3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height = ");
        int n=sc.nextInt();
        System.out.print("Enter width = ");
        int m=sc.nextInt();
        if(n != m && m != 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("B ");
                }
                System.out.println();
            }
        }
    }
}
