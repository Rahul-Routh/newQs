package NewQuestion;
import java.util.Scanner;

public class Qs4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number = ");
        int n=sc.nextInt();
        int i=0,temp,max=-999999999,min=99999999,k=0;
        int arr[] =new int[5000];
        while(i<n) {

            temp= sc.nextInt();

            for(int j=0;j<arr.length;j++) {
                if(temp==arr[j]) {
                    System.out.println("You have already enter the number. Please enter again ");
                    n++;
                    break;
                }
            }
            arr[k]=temp;
            k++;

            if (temp > max)
                max=temp;
            if (temp < min)
                min=temp ;
            i++;
        }
        System.out.println("max value "+max+" min value "+min);
    }
}
