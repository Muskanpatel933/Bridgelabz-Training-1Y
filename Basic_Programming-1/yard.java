import java.util.Scanner;
class Yard{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("the distance in feet is:");
double dis=s.nextDouble();
double yard=dis/3;
double inch=yard*36;
System.out.println("the distance in yard is:" + yard + "The distance in inch is:" +inch);
}
}