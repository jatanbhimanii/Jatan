public class Prac4_3 {
    public static void main(String[] args) {
        try{
 /*           //1
            int a=10,b=0;
            int c=a/b;
            System.out.println("c="+c);
*/
            //2
            int []Array=new int[20]; 
            for(int i=0;i<20;i++){
                Array[i]=i+1;
            }
            System.out.println(Array[30]);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("\n--------20CE007_Jatan Bhimani--------");
        }
    }
}
