import java.util.*;
class Area
{
double length,breadth;
Area()
{
length=0.0;
breadth=0.0;
}
Area(double a,double b)
{
length=a;
breadth=b;
}
Double returnarea()
{
double area=length*breadth;
return area;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter length: ");
double n=sc.nextDouble();
System.out.print("Enter breadth: ");
double m=sc.nextDouble();
Area a1=new Area(n,m);
double area1=a1.returnarea();
System.out.println("Area is : "+area1);
System.out.println("\nMIRAL JOSHI-20DCS033\n");
}
}