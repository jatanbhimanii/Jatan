import java.util.Random;
class Odd extends Thread{
    int [] array; Odd(int [] array)
    {
    this.array=array; this.setName("Odd Thread: "); start();
    }
    public void run()
    {
    System.out.println(getName() + "\t");
    for (int j=0;j<array.length;j++)
    {
    if(j%2==1)
    {
    System.out.println(getName()+" : "+array[j]);
    }
    }
    }
    }
    class Even extends Thread
    {
    int [] array; Even(int [] array)
    {
    this.array=array; this.setName("Even Thread: "); start();
    }
    
    public void run()
    {
    System.out.println(getName() + "\t");
    for (int j=0;j<array.length;j++)
    {
    if(j%2==0)
    {
    System.out.println(getName()+ " : "+ array[j]);
    }
    }
    }
    }
    
    public class Prac6_2
    {
    public static void main(String[] args)
    {
    Random rand = new Random();
    int arr[]= new int[15];
    System.out.println("Random Numbers: "); 
    for (int j=0;j<arr.length;j++)
    {
    arr[j]=rand.nextInt(100);
    System.out.println(arr[j]+" ");
    }
    Odd t1=new Odd(arr); 
    Even t2=new Even(arr);
    System.out.println("\nJatan Bhimani\n 20CE007");
    }
    }
    