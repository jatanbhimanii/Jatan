import java.util.Scanner;
 class STP2 {
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
        System.out.println("9 in the array is encountered :"+ar_cnt(a,n)+" times");
        System.out.println("MIRAL JOSHI- 20DCS033");
        obj.close();

    }
    public static int ar_cnt(int []a,int n)
    {
        int count=0;
        for(int i=0; i<n ; i++ )
        {
            if(a[i]==9)
            {
                count++;
            }
        }
        return count;
    }


    
}
