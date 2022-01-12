class Employee
{
String Fname,Lname;
Double salary;
Employee()
{
Fname="";
Lname="";
salary=0.0;
}
Employee(String x,String y,Double z)
{
Fname=x;
Lname=y;
if(z>0)
{
salary=z;
}
}
String getFname()
{
return Fname;
}
String getLname()
{
return Lname;
}
double getsalary()
{
return salary;
}
void setFname(String a)
{
Fname=a;
}
void setLname(String b){
    Lname=b;
    }
    void setsalary(double c)
    {
    if(c>0)
    {
    salary=c;
    }
    }
    void display()
    {
    System.out.println();
    System.out.println("Name : "+getFname()+" "+getLname());
    System.out.println("Salary : "+getsalary());
    }
    void raise(double n)
    {
    salary=salary+(salary*n/100);
    }
    }
    class EmployeeTest
    {
    public static void main(String args[])
    {
    Employee e1=new Employee("Raghav","Zed",50000.0);
    Employee e2=new Employee("Raman","len",50500.0);
    e2.setLname("Dome");
    e1.display();
    e2.display();
    e1.raise(10.0);
    e2.raise(10.0);
    System.out.println();
    System.out.println("After 10 % raise:-");
    System.out.println();
    e1.display();
    e2.display();
    System.out.println("\nMIRAL JOSHI-20DCS033\n");
    }
    }