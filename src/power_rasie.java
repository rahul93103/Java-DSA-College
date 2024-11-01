import java.util.*;
public class power_rasie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter second number: ");
        int num2=sc.nextInt();
        System.out.println(num1+" raise to power "+num2+" is: " +(int)Math.pow(num1,num2));
    }
}
