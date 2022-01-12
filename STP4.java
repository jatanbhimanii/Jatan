import java.util.*;
class STP4 {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
        str=obj.nextLine();
        System.out.println(double_char(str));
        System.out.println("MIRAL JOSHI- 20DCS033");
        obj.close();
     }
     public static String double_char(String str1)
     {
         String s="";
         for(int i=0;i<str1.length();i++)
         {
             s = s+str1.charAt(i)+str1.charAt(i);
         }
         return s;
     }

    
}
