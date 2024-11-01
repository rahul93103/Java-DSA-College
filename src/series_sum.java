import java.util.*;
public class series_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the series of number: ");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            if(i%2==0){
                sum-=i;
            }
            else {
                sum+=i;
            }
        }

        System.out.println(sum);
    }
}
