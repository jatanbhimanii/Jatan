import java.util.Scanner;
import java.lang.String;

public class test1
{
    public static void main(String args[]) {
        while (true) {
            System.out.println("Input contact number in \"+91-AA-BBB-CCCCC\" format: ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String[] split_string = str.split("-");
            if (str.length() == 16) {
                System.out.println("Mobile system operator code is: " + split_string[1]);
                System.out.println("MSC is: " + split_string[2]);
                System.out.println("Unique code is: " + split_string[3]);
                break;
            } else {
                System.out.println("enter in correct sequence");
                continue;
            }
        }
        System.out.println("MIRAL JOSHI - 20DCS033");
    }
}