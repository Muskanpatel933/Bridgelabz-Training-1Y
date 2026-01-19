import java.util.Scanner;
class Handshake{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number of students:");
double n=s.nextDouble();
double handS=(n*(n-1))/2;
System.out.println("the possible handshake is :" + handS);
}
}