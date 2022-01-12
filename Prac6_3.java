public class Prac6_3
{
public static void main(String[] args)
{
int count=0;
try {
for(int i=0;i<15;i++)
{
Thread.sleep(1000); count++;
System.out.println("Value of variable after one second is :"+count);
}
}catch (Exception e)
{
System.out.println("Interrupted Exception is occured"+e);
System.out.println("\nJatan Bhimani\n20CE007");
}
}
}
