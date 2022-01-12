import java.util.Scanner;
abstract class Quiz {

    abstract void fun();
}
class Inner_Quiz extends Quiz{
    void fun(){
        System.out.println("Hello Welcome To Our Quiz Game!!\nMake Your Choice From Below Option By Entering Number Of Your Choice");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 if you want to play on sports quiz.");
        System.out.println("Press 2 if you want to play on programming quiz.");
        System.out.println("Press 3 if you need any help");
        System.out.println("Enter Your Choice: ");
        int Choice = sc.nextInt();
        int Sa1,Sa2,Sa3,Sa4,Sa5;
        int Pa1,Pa2,Pa3,Pa4,Pa5;
        int score = 0;
        int programming_score = 0;
        switch (Choice) {
            case 1:
                System.out.println("\nQuestion 1\n\tWhat is the national sport of India?");
                System.out.println("\t1. Hockey               2. Cricket\n\t3. Football             4. Basketball");
                System.out.println("Enter Your Answer: ");
                Sa1 = sc.nextInt();
                if (Sa1 == 1) {
                    score++;
                }
                System.out.println("\nQuestion 2\n\tWhat is the national game of China?");
                System.out.println("\t1. Hockey               2. Cricket\n\t3. Table Tennis         4. Basketball");
                System.out.println("Enter Your Answer: ");
                Sa2 = sc.nextInt();
                if (Sa2 == 3) {
                    score++;
                }
                System.out.println("\nQuestion 3\n\tThe term Grand Slam is associated with?");
                System.out.println("\t1. Football               2. Cricket\n\t3. Lawn Tennis            4. Esports");
                System.out.println("Enter Your Answer: ");
                Sa3 = sc.nextInt();
                if (Sa3 == 3) {
                    score++;
                }
                System.out.println("\nQuestion 4\n\tWho was the first Test centurion in Indian Cricket?");
                System.out.println("\t1. Kapildev               2. Lala Amarnath.\n\t3. L P Jai                4. C K Naidu");
                System.out.println("Enter Your Answer: ");
                Sa4 = sc.nextInt();
                if (Sa4 == 2) {
                    score++;
                }
                System.out.println("\nQuestion 5\n\tIn 2014 FIFA World Cup will be held in?");
                System.out.println("\t1. Japan               2. China\n\t3. Brazil              4. London");
                System.out.println("Enter Your Answer: ");
                Sa5 = sc.nextInt();
                if (Sa5 == 4) {
                    score++;
                }
                System.out.println("Total Score: "+score +"/5");
                System.out.println("Do you want to play again?\nIf Yes, Press 1. If no, Press 2");
                int Choice_Again = sc.nextInt();
                if(Choice_Again == 1){
                    fun();
                }
                else{
                    System.out.println("Thank you playing game!!");
                }
                break;
            case 2:
                System.out.println("\nQuestion 1\n\tThe _________ is a computer program that translates the source code into corresponding object code?");
                System.out.println("\t1. Compiler               2. Assembler\n\t3. Interpreter            4. None of the above");
                System.out.println("Enter Your Answer: ");
                Pa1 = sc.nextInt();
                if (Pa1 == 1) {
                    programming_score++;
                }
                System.out.println("\nQuestion 2\n\tWhich one is a special function in C system to tell the computer where the program start?");
                System.out.println("\t1. sub()               2. main()\n\t3. fun()               4. go()");
                System.out.println("Enter Your Answer: ");
                Pa2 = sc.nextInt();
                if (Pa2 == 2) {
                    programming_score++;
                }
                System.out.println("\nQuestion 3\n\tIn a passage of text individual words and punctuation marks are called?");
                System.out.println("\t1. Tokens               2. Identifiers\n\t3. String               4. Operators");
                System.out.println("Enter Your Answer: ");
                Pa3 = sc.nextInt();
                if (Pa3 == 1) {
                    programming_score++;
                }
                System.out.println("\nQuestion 4\n\tAn _______ is a fixed size sequence collection of elements of the same data type?");
                System.out.println("\t1. Integer               2. Function\n\t3. Pointer               4. Array");
                System.out.println("Enter Your Answer: ");
                Pa4 = sc.nextInt();
                if (Pa4 == 4) {
                    programming_score++;
                }
                System.out.println("\nQuestion 5\n\tAutomatic variable also referred to as?");
                System.out.println("\t1. Global Variable               2. External Variable\n\t3. Internal Variable             4. Local Variable");
                System.out.println("Enter Your Answer: ");
                Pa5 = sc.nextInt();
                if (Pa5 == 3) {
                    programming_score++;
                }
                System.out.println("Total Score: "+programming_score+"/5");
                break;
                System.out.println("Do you want to play again?\nIf Yes, Press 1. If no, Press 2");
                int Choice_Again = sc.nextInt();
                if(Choice_Again == 1){
                    fun();
                }
                else{
                    System.out.println("Thank you playing game!!");
                }
            case 3:
                System.out.println("-------------------------HELP-------------------------");
                System.out.println("This is a quiz game. You have 2 option to play for in this game.\nOne is Sports quiz. And another one is programming quiz.\nThere will be option where you can play any of the one.");
                fun();
            default:
                break;
        }
    }
}
public class Java_Project {
    public static void main(String[] args) {
        Quiz Q1 = new Inner_Quiz();
        Q1.fun();
    }
}