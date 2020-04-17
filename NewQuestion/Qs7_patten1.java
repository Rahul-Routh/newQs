package NewQuestion;

import java.util.Scanner;

public class Qs7_patten1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows = ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=2;j<=(2*i-1);j++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
