import java.util.Scanner;
public class Practical3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no. : ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd no. : ");
        int y = sc.nextInt();
        int m = 0;
        int n = 0;

        while (x!=0) {
            m=0;
            m=x%10;
            x=x/10;
        }
        while (y!=0) {
            n=0;
            n=y%10;
            y=y/10;
        }
        if (m == n) {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }    
}
