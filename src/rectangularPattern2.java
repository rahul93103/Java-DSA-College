import java.util.*;
public class rectangularPattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                System.out.print(j);
            }
            for(int k=1;k<i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
