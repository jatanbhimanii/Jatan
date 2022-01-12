import java.util.*;
class STP1
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int n;
        String str;
        System.out.println("Enter String and Integer: ");
        str=obj.nextLine();
        n= obj.nextInt();
        front_times(str, n);

        System.out.println("\nMIRALJOSHI-20DCS033");
        obj.close();

    }
    public static void front_times(String s,int n)
    {
        while(n>0)
        { 
            n--;
            if(s.length()>2){
                System.out.print(s.substring(0,3));
            }
            else{
                System.out.print(s);
            }        
        
        }
    }

}