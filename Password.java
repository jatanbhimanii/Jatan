

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password =  sc.next();
        int count=0;
        if(password.matches(".[a-z].")) {
            count++;
        }

        if(password.matches(".[A-Z].")) {
            count++;
        }

        if(password.matches(".[0-9].")) {
            count++;
        }
        
        if(password.length() == 10 && count >= 3)
        {
            System.out.println("Valid Password");
        }else {
            System.out.println("Invalid Password");
        }
    }
}