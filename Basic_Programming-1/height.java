import java.util.Scanner;
class height{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter your height in cm:");
int h=s.nextInt();
double feet=h/30.48;
System.out.println("your height in feet is:" +feet);
double inch= h*0.3937;
System.out.println("your height in inch is:" +inch);
}
}
