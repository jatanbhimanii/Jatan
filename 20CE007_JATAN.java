import java.util.ArrayList;
import java.util.Scanner;
public class Practical_Exam {
    public static void main(String[] args) {
      
        String Name;
        int NumberShares;
        double BuyPrice, SellPrice;
        String Date_Purchase , Date_Sell;

        ArrayList<String> shares = new ArrayList<String>();

        shares.add("Google");
        shares.add("\n Microsoft");
        shares.add("\n Samsung");
        shares.add("\n Apple");
        shares.add("\n Tesla");

        System.out.println("\nGoing trough the list: \n");
        System.out.println(shares);

        Scanner input = new Scanner(System.in);
        System.out.print("Which share would you like to purchase?");
        Name = input.nextLine();

        System.out.print("How many shares bought?: ");
        NumberShares = input.nextInt();
        System.out.print("Buy price?: ");
        BuyPrice = input.nextDouble();
        System.out.print("Sale price: ");
        SellPrice = input.nextDouble();
        System.out.println("Date of Purchase: ");
        Date_Purchase = input.next();
        System.out.println("Date of Sell: ");
        Date_Sell = input.next();
        input.close();

        System.out.println(Name + "here is the information of your stock transactions:");
        System.out.println("Number of shares:" + NumberShares);
        System.out.println("Amount of purchase:$ " + BuyPrice * NumberShares);
        System.out.println("Date of Purchase: " +Date_Purchase);
        System.out.println("Amount of sell:$ " + SellPrice * NumberShares);
        System.out.println("Date of Sell: " +Date_Sell);
        System.out.println("Net profit:$ " + (SellPrice * NumberShares - BuyPrice));
        System.out.println("20CE007_Jatan");

    }

}