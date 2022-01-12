public class Prac6_1_B implements Runnable
{
public void run()
{
System.out.println("Hello World");
}
public static void main(String[] args)
{
Prac6_1_B obj=new Prac6_1_B(); 
Thread t= new Thread(obj);
t.start();
System.out.println("\nJatan Bhimani\n20CE007");
}
}
