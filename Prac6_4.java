import java.lang.*;
public class Prac6_4 extends Thread {
public void run()
{
System.out.println("Inside run method");
}
public static void main(String[] args)
{
Prac6_4 FIRST = new Prac6_4();
Prac6_4 SECOND = new Prac6_4();
Prac6_4 THIRD = new Prac6_4();
System.out.println("First thread priority : "+
FIRST.getPriority());
System.out.println("Second thread priority : "+
SECOND.getPriority());
System.out.println("Third thread priority : "+
THIRD.getPriority());
FIRST.setPriority(3);
SECOND.setPriority(5);
THIRD.setPriority(7);
System.out.println(" 	");
System.out.println("First thread priority : "+
FIRST.getPriority());
System.out.println("Second thread priority : "+
SECOND.getPriority());
System.out.println("Third thread priority : "+
THIRD.getPriority());
System.out.println("\nJatan Bhimani\n20CE007");
}
}
