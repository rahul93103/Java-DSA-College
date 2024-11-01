import java.util.Scanner;
public class sumDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the digit:");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        System.out.println("Sum of number is: "+sum);
    }
}
