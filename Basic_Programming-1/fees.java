import java.util.Scanner;
class fees{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the fees:");
double fee=s.nextDouble();
System.out.println("enter the discount percentage:");
double dp=s.nextDouble();
double dm=fee*(dp/100);
System.out.println("the discount fees is:" +dm);
double df=fee-dm;
System.out.println("the final discount fees is:" +df);
}
}