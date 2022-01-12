import java.util.*;
class Complex
{
int real;
int img;
Complex()
{
real=0;
img=0;
}
public static void sum(Complex c3,Complex c4)
{
System.out.print("Sum of Complex: "+(c3.real+c4.real));
if((c3.img+c4.img)>0)
{
System.out.print(" + "+(c3.img+c4.img)+"i");
}
else
{
System.out.println(" - "+(c3.img+c4.img)+"i");
}
}
public static void diff(Complex c3,Complex c4)
{
System.out.print("Difference of Complex: "+(c3.real-c4.real));
if((c3.img-c4.img)>0)
{
System.out.print(" + "+(c3.img-c4.img)+"i");
}
else
{
System.out.println(" - "+(c3.img-c4.img)+"i");
}
}
public static void product(Complex c3,Complex c4)
{
System.out.print("Product of Complex: "+((c3.real*c4.real)-(c3.img*c4.img)));
if((c3.real*c4.img)+(c4.real*c3.img)>0)
{
System.out.print(" + "+((c3.real*c4.img)+(c4.real*c3.img))+"i");
}
else
{
System.out.println(" - "+((c3.real*c4.img)+(c4.real*c3.img))+"i");
}
}
public static void main(String argd[])
{
Scanner sc=new Scanner(System.in);
Complex c1=new Complex();
Complex c2=new Complex();
System.out.print("Enter real part for c1: ");
c1.real=sc.nextInt();
System.out.print("Enter imaginary part for c1: ");
c1.img=sc.nextInt();
System.out.print("Enter real part for c2: ");
c2.real=sc.nextInt();
System.out.print("Enter imaginary part for c2: ");
c2.img=sc.nextInt();
System.out.println();
sum(c1,c2);
System.out.println();
diff(c1,c2);
System.out.println();
product(c1,c2);
System.out.println();
System.out.println("\nMIRAL JOSHI-20DCS033\n");
}
}