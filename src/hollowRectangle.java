import java.util.Scanner;
public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of border: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<6;j++){
                if(i==0 || i==num-1 || j==0 || j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
