import java.util.Scanner;
class Quotient{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
double x=a/b;
double y=a%b;
System.out.println("the remainder is:" + x + "the quotient:" +y);
}
}