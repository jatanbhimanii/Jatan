abstract class GeometricObject
    {
        public String Color="Blue";
        public boolean filled;
        public java.util.Date dateCreated;
        
        public GeometricObject(){
            dateCreated=new java.util.Date();
        }
        public GeometricObject(String color,boolean filled)
        {
            this.Color=color;
            this.filled=filled;
        }
        public String getcolor(){
            return Color; 
        } 
        public void setcolor()
        {
            this.Color = Color;
        }
        public boolean isfilled()
        {
            return filled;
        }
        public java.util.Date getDateCreated()
        {
            return dateCreated;
        }
        public abstract double getArea();
        public abstract double getprimeter();
    }

class Circle extends GeometricObject
{
    double radius;
    Circle()
    {
        
    }
    Circle(double radius)
    {
        this.radius=radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setradius(double radius)
    {
        this.radius=radius;
    }
    public double getDiameter()
    {
        return 2*radius;
    }
    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public double getPerimeter()
    {
        return 2*radius*Math.PI;
    }

    @Override
    public double getprimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class Rectangle extends GeometricObject
{
    double width;
    double height;
    Rectangle()
    {
        
    }
    Rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;
    }
    Rectangle(double width,double height,String color,boolean filled)
    {
        super(color,filled);
        this.width = width;
        this.height = height;
    }
    public double getWidth()
    {
        return width;
    }
    public double getheight()
    {
        return height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getArea()
    {
        return height*width;
    }
    public double getperimeter()
    {
        return 2*(width+height);
    }

    @Override
    public double getprimeter() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}   

public class prac3_1{
    public static void main(String[] args)
    {
        Rectangle Rec = new Rectangle(28,31);
        Circle cir = new Circle(31);
        System.out.println("----------Class Circle----------");
        System.out.println("Area of Circle: "+cir.getArea());
        System.out.println("Area of Perimeter: "+cir.getPerimeter());
        System.out.println("Diameter of Circle: "+cir.getDiameter());
        System.out.println("-----------------------------------");
        System.out.println("----------Class Rentangle----------");
        System.out.println("Area of Rentangle: "+Rec.getArea());
        System.out.println("Area of Perimeter: "+Rec.getperimeter());
    }
}
