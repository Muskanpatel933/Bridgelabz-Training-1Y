import java.util.Scanner;
class Sam{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the maths:");
int maths=s.nextInt();
System.out.println("enter the phy:");
int phy=s.nextInt();
System.out.println("enter the chem:");
int chem=s.nextInt();
System.out.println("enter the sum:");
int sum=(maths+phy+chem)/3;
System.out.println("averge:"+sum);
}
}