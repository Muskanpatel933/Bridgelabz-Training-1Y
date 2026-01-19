import java.util.Scanner;
class rectangle{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int length=s.nextInt();
int width=s.nextInt();
double perimeter=2*(length + width);
System.out.println("the perimeter of rectangle is:" +perimeter);
}
}