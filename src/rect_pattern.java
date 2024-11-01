import java.util.*;
public class rect_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of pattern: ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
