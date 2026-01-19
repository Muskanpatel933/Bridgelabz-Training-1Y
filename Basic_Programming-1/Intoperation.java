import java.util.Scanner;
class Intoperation{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
double x=a+b*c;
double y=a*b+c;
double z=c+a/b;
double yz=a%b+c;
System.out.println("x=" +x+ "y=" +y+ "z=" +z+ "yz=" +yz);
}
}