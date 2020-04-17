package NewQuestion;

public class Qs6 {
    public static void main(String[] args) {
        double temp=1;
        for(int i=1;i<=20;i++){
            if(i%2 != 0)
                System.out.println(i);
                temp *= i;
        }
        System.out.println("multiplication of 1 to 20 all odd number is "+temp);
        temp=1;
        for(int i=1;i<=100;i++){
            if(i%2==0)
                System.out.println(i);
               temp += i;
        }
        System.out.println("sum of 1 to 100 all even number is "+temp);
    }
}
