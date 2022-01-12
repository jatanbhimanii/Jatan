import java.util.Scanner;

public class miral {
    public static void main(String[] args) {
        int Code[]={1,2,3,4,5};
        Integer Price[]={500,400,600,350,440};

        Scanner sc = new Scanner(System.in);

        System.out.println("-----List of Item Code and Price-----");
        System.out.println("Item                Code            Price(In Rupees)");
        System.out.println("Motors              " +Code[0] + "                " + Price[0]);
        System.out.println("Fans                " +Code[1] + "                " + Price[1]);
        System.out.println("Motors              " +Code[2] + "                " + Price[2]);
        System.out.println("Motors              " +Code[3] + "                " + Price[3]);
        System.out.println("Motors              " +Code[4] + "                " + Price[4]);

        System.out.println("Enter your choice: ");
        int Choice = sc.nextInt();

        switch (Choice) {
            case 1:
                System.out.println("--------------Bill-------------");
                System.out.println("Item: Motor");
                System.out.println("Code: " + Code[0]);
                System.out.println("Price: " + Price[0] );
                System.out.println(" Tax: 8%");
                Double Total_Motor=(Double)((0.08)*Price[0])+Price[0];
                System.out.println(" Total Price(including Tax): " +Total_Motor);
                break;
            case 2:
                System.out.println("--------------Bill-------------");
                System.out.println("Item: Fan");
                System.out.println("Code: " + Code[1]);
                System.out.println("Price: " + Price[1]);
                System.out.println(" Tax: 12%");
                Double Total_Fan=(Double)((0.12)*Price[1])+Price[1];
                System.out.println(" Total Price(including Tax): " +Total_Fan);
                break;
            case 3:
                System.out.println("--------------Bill-------------");
                System.out.println("Item: Tube");
                System.out.println("Code: " + Code[2]);
                System.out.println("Price: " + Price[2]);
                System.out.println(" Tax: 5%");
                Double Total_Tube=(Double)((0.05)*Price[2])+Price[2];
                System.out.println(" Total Price(including Tax): " +Total_Tube);
                break;
            case 4:
                System.out.println("--------------Bill-------------");
                System.out.println("Item: Wires");
                System.out.println("Code: " + Code[3]);
                System.out.println("Price: " + Price[3]);
                System.out.println(" Tax: 7.5%");
                Double Total_Wire=(Double)((0.075)*Price[3])+Price[3];
                System.out.println(" Total Price(including Tax): " +Total_Wire);
                break;
            case 5:
                System.out.println("--------------Bill-------------");
                System.out.println("Item: Others");
                System.out.println("Code: " + Code[4]);
                System.out.println("Price: " + Price[4]);
                System.out.println(" Tax: 7.5%");
                Double Total_Others=(Double)((0.03)*Price[4])+Price[4];
                System.out.println(" Total Price(including Tax): " +Total_Others);
                break;
            default:
                break;
        }

    }    
}
