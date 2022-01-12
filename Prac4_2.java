public class Prac4_2 {
    static void fun()
    {
        try
        {
            throw new NullPointerException("PRACTICAL4_2(Trying throw).");
        }
        catch(NullPointerException e)
        {
            System.out.println("Catch inside fun().");
            throw e;
        }
    }
    static void fun1() throws IllegalAccessException
    {
        System.out.println("In fun1().");
        throw new IllegalAccessException("PRACTICAL4_2(Trying throws).");
    }
 
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main() using throw.");
        }
        try
        {
            fun1();
        }
        catch(IllegalAccessException e)
        {
            System.out.println("Catch in main() using throws.");
        }
        System.out.println("\n--------20CE007_Jatan Bhimani--------");
    }    
}
