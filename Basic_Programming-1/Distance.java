import java.util.Scanner;
class Distance{
public static void main(String args [])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the distance of km:");
int km=s.nextInt();
double mile=1.6*km;
System.out.println("convert the km into mile:"+mile);
}
}