import java.util.Scanner;
class Convert{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the distance in km:");
double km=s.nextDouble();
double miles=km*0.621;
System.out.println("the distance in km to miles is:" + miles);
}
}
