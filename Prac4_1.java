public class Prac4_1 {
    public static void main(String args[]){
        try{
            int a[]=new int[10];
            a[4]=30/0;
            System.out.println("------Try Block-----");
        }
        catch(ArithmeticException e){
           System.out.println("ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException e){
           System.out.println("--------ArrayIndexOutOfBoundsException--------");
        }
        catch(Exception e){
           System.out.println("--------Some Other exception--------");
        }
      System.out.println("\n--------20CE007_Jatan Bhimani--------");
     }
}
