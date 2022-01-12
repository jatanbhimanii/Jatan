import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.NullPointerException;

class collection {
    private Scanner sc = new Scanner(System.in);
    private int id;
    private String company;
    private int no_of_shares;
    private double purchase_price;
    private String date_of_purchase;
    private double sell_price;
    private String date_of_sale;


    public collection(int id, String company, int no_of_shares) {
        this.id = id;
        this.company = company;
        this.no_of_shares = no_of_shares;
    }


    public int buy_share() {
        System.out.println("Enter number of shares you want to buy: ");
        int bs = sc.nextInt();
        return bs;
    }

    public int sell_share() {
        System.out.println("Enter number of shares you want to sell: ");
        int ss = sc.nextInt();
        return ss;
    }

    public void final_share() {
        System.out.println("Total number of shares = " + no_of_shares);
        int bs1 = buy_share();
        int ss1 = sell_share();
        no_of_shares = no_of_shares + bs1 - ss1;
        System.out.println("Number of shares buyed = " + bs1);
        System.out.println("Number of shares sold = " + ss1);
        System.out.println("Total number of shares = " + no_of_shares);
    }



    public void share_report() {
        collection a = new collection(1, "Mcafee", 4200);
        collection b = new collection(2, "SalePush", 8200);
        collection c = new collection(3, "Formonix", 5900);
        ArrayList<collection> al=new ArrayList<collection>();
        al.add(a);//adding Student class object
        al.add(b);
        al.add(c);
        Iterator itr=al.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            collection d=(collection) itr.next();
            System.out.println("ID - "+d.id);
            System.out.println("Year of experience - "+d.company);
            System.out.println("Special Quality - "+d.no_of_shares);
        }
    }

    public void sold_report() {
        collection a = new collection(1, "Mcafee", 200);
        collection b = new collection(2, "SalePush", 500);
        collection c = new collection(3, "Formonix", 100);
        ArrayList<collection> al=new ArrayList<collection>();
        al.add(a);//adding Student class object
        al.add(b);
        al.add(c);
        Iterator itr=al.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            collection d=(collection) itr.next();
            System.out.println("ID - "+d.id);
            System.out.println("Company name - "+d.company);
            System.out.println("Profit/loss - "+d.no_of_shares);
        }


    }

    public static void main(String[] args) throws NullPointerException {
        collection a = new collection(1, "Mcafee", 4500);
        a.final_share();
        collection b = new collection(2, "SalePush", 8000);
        b.final_share();
        collection c = new collection(3, "Formonix", 6000);
        c.final_share();
        a.share_report();
        a.sold_report();

    }
}