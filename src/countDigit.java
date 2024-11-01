//import java.util.Scanner;
import java.util.*;
public class countDigit {
    public static void main(String[] args) {
        System.out.print("Enter the digit: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        num=Math.abs(num);
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.println("Length of digit is: "+count);
    }
}
