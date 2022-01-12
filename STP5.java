import java.util.Scanner;
class STP5
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=obj.nextLine();
       
        System.out.println(str);
        char st[]= str.toCharArray();
        char temp;
        String sorted="";
        
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
