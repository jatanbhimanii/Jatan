import java.util.*;
public class practical3_2 {
double base,height;
practical3_2()
{
base= 3;
height= 4;
}
practical3_2(double a)
{
base= a;
height= 4;
}
practical3_2(double x,double y)
{
base=x;
height=y;
}
void calcArea()
{
double area=base*height/2;
System.out.println("Area is : "+area);
}
public static void main(String args[])
{
practical3_2 t1=new practical3_2();
practical3_2 t2=new practical3_2(5);
practical3_2 t3=new practical3_2(10,10);
System.out.println("t1 (Without argument):-");
t1.calcArea();
System.out.println("t2 (With one argument):-");
t2.calcArea();
System.out.println("t3 (With two argument):-");
t3.calcArea();
}
}
