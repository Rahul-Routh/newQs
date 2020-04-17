package NewQuestion;

import java.util.Scanner;

public class Patten2 {
    public static void main(String[] args) {

//    for(int i=5;i>=1;i--){
//        for(int j=1;j<=i;j++){
//            System.out.print(j);
//        }
//        for(int k=i;k<6;k++){
//            System.out.print("&");
//        }
//        System.out.println();
//    }
//        for(int l=1;l<=6;l++){
//            System.out.print("&");
//        }
//    }
        //--------------user input-----
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number = ");
        int n=sc.nextInt();
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i; k < n; k++) {
                System.out.print("&");
            }
            System.out.println();
        }
        for (int l = 1; l <= n; l++) {
            System.out.print("&");
        }
    }
}
