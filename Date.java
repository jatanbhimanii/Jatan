class Date 
{ 
int dd,mm,yy; 
Date() 
{ 
dd=1; 
mm=1; 
yy=2001; 
} 
Date(int d,int m,int y) 
{ 
dd=d; 
mm=m; 
yy=y; 
} 
int getdate() 
{ 
return dd; 
} 
int getmonth() 
{ 
return mm; 
} 
int getyear() 
{ 
return yy; 
} 
void setdate(int a) 
{ 
dd=a; 
} 
void setmonth(int b) 
{ 
mm=b; 
} 
void setyear(int c) 
{ 
yy=c; 
} 
void displaydate(){ 
System.out.println("Date:"+getdate()+"/"+getmonth()+"/"+getyear()); 
} 
} 
class dateTest 
{ 
public static void main(String args[]) 
{ 
Date d1=new Date(10,8,2003); 
d1.displaydate(); 
System.out.println("After changing date and year :"); 
d1.setdate(27); 
d1.setyear(2001); 
d1.displaydate(); 
System.out.println("\nMIRAL JOSHI-20DCS033\n");
} 
}
