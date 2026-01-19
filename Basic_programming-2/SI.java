import java.util.Scanner;
class SI{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the value of inital amount:");
int p=s.nextInt();
System.out.println("enter the value of  rate of interest:");
int r=s.nextInt();
System.out.println("enter the time:");
int t=s.nextInt();
double a=(p*r*t)/100;
System.out.println(" the simple interest is :" +a);
}
}