import java.util.Scanner;
class STP6 
{

    public static void main(String[] args)
   { 
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the string: ");
       String str=obj.nextLine();
      char st[]= str.toCharArray();
       int len=str.length();
        char temp;
       String sorted="";
       System.out.println("THE LENGHT of the string is: "+len);
       String up=str.toUpperCase();
       System.out.println("THE uppercase STRING is: "+up);
       String lo=str.toLowerCase();
       System.out.println("THE uppercase STRING is: "+lo);
       String rev="";
       for(int i=len-1;i>=0;i--)
       {
           rev+=str.charAt(i);
       }
       System.out.println("the reverse of String is: "+rev);
       
         for(int i=0;i<st.length;i++)
    {
        for(int j=i+1;j<st.length;j++)
        {
            if(st[i]>st[j])
            {
                 temp = st[i];
                st[i] = st[j];
                st[j] = temp;
             }
        }
    }
    for(int k=0;k<st.length;k++)
    {
        sorted=sorted+st[k];
    }
      System.out.println("THE ASCENDING SORTING IS :"+sorted); 
      System.out.println("MIRAL JOSHI- 20DCS033");
      obj.close();
    }
}
