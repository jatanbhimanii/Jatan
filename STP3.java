import java.util.*;
public class STP3 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n=obj.nextInt();
        int []a=new int[n];
        for(int i=0;i<n ; i++)
        {
            System.out.println("Enter Element no "+(i+1) + " :");
            a[i]=obj.nextInt();
        }
        System.out.println("Enter An Integer Value: ");
        int m = obj.nextInt();
        System.out.println("Result :"+front(a,n,m));
        System.out.println("MIRAL JOSHI- 20DCS033");
        obj.close();
    }
    public static boolean front(int []a,int n,int b)
    {
        boolean Result=false;
        for(int i=0; i<n ; i++ )
        {
            if(a[i]==b)
            {
                Result=true;
            }
        }
    return Result;
    
    }   
}
