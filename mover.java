class mover
{
private void mo()
{
System.out.println("Private method");
}
private int mo(int i)
{
System.out.println("Private int method:");
System.out.println("Passed  "+i);
return 1;
}
protected double mo(double j)
{
System.out.println("protected double method:");
System.out.println("Passed: "+j);
return 1.5;
}
public void mo(int l,double k)
{
System.out.println("public void method with int and double argument:");
System.out.println("Passed :\n int="+l+"\nDouble: "+k);
}
public static void main (String[] args) throws java.lang.Exception
{
mover m1=new mover();
m1.mo();
int j=m1.mo(2);
double k=m1.mo(2.5);
m1.mo(3,3.5);
System.out.println("\nMIRAL JOSHI-20DCS033\n");
}
}