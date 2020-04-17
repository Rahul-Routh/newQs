package NewQuestion;

import Solve.SwitchCaseCalculator;

import java.util.Scanner;

public class Qs18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter word = ");
        String s=sc.nextLine();
        char ch;
        int j=0;
        System.out.println("Vowels are = ");
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);

            switch(ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    j=1;
                    System.out.println(ch);

            }
        }
        if(j==0){
            System.out.println("There are no vowels in word");
        }

    }
}
