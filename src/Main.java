import java.util.*;

public class Main {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);

        // Program to find n number of digits
/*
        System.out.println("Enter a number of any length: ");
        int num=sc.nextInt();
        num=Math.abs(num);
        int count=0;
        do{
            count++;
            num/=10;
        }while(num>0);
             System.out.println("Length of number is: "+count);  */


        // Program for finding sum of n number

        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum: "+sum);

    }

}