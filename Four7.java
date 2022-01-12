class shape
{
void display()
{
System.out.println(" This is a shape");
}
}
interface sign
{
void text(String s);
}
interface cir extends sign
{
default void print()
{
System.out.println(" This is circle:");
}
}
class Circle2 extends shape implements cir, sign
{
int radius;
String
color;
Circle2(int i, String s)
{
radius = i; color = s;
}
public void display()
{
super.display();
System.out.println(" Radius of the circle is : " + radius + "\n Area of the circle is :" + 3.14*radius*radius);
System.out.println(" Color of the circle is : " + color);
}
public void text(String s)
{
System.out.println(" Sign : " + s);
}
}
interface rect
{
default void print()
{
System.out.println(" This is Rectangle:");
}
}
class Rectangle2 extends shape implements rect,sign
{
int length, width;
String color;
Rectangle2(int l, int w, String s)
{
length = l;
width = w;
color = s;
}
void display()
{
super.display();
System.out.println(" Area of the rectangle is : " + length*width);
System.out.println(" Color of the rectangle is : " + color);
}
public void text(String s)
{
System.out.println(" Sign : " + s);
}
}
public class Four7
{
public static void main(String[] args)
{
Circle2 c = new Circle2(2,"Red"); c.display();
c.text("Left");
System.out.println();
Rectangle2 R = new Rectangle2(2,4,"yellow"); R.display();
R.text("right");
System.out.println("20DCS033-MIRAL JOSHI");
}
}
