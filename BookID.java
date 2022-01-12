import java.util.Scanner;

class BookID {

    public String book_ID;
    BookID(){

    }
    
    public void setbook_id() {
        Scanner scanf = new Scanner(System.in);

        System.out.println("Enter Book ID: ");
        book_ID = scanf.nextLine();
        scanf.close();
    }
    public void getbook_id(){
        System.out.println("Entered Book ID: " +book_ID);
        char book_name = book_ID.charAt(0);
        char book_name1 = book_ID.charAt(1);
        char book_name2 = book_ID.charAt(2);
        System.out.println("Book Name " + book_name + book_name1 + book_name2);

        char Publisher = book_ID.charAt(3);
        char Publisher1 = book_ID.charAt(4);
        System.out.println("Publisher Code: " +Publisher + Publisher1);

        char Title = book_ID.charAt(5);
        char Title_1 = book_ID.charAt(6);
        char Title_2 = book_ID.charAt(7);
        System.out.println("Title Number Of The Book: " +Title + Title_1 + Title_2);
    }
    public static void main(String[] args) {
        BookID m1 = new BookID();

        m1.setbook_id();
        m1.getbook_id();
        System.out.println("\n-----------------------------------/n");
        System.out.println("20DCS033_Miral Joshi");
    }
}
