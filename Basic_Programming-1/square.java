import java.util.Scanner;
class Square{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the perimeter of sqaure:");
int p=s.nextInt();
int side=p/4;
int area=side*side;
System.out.println("the area of sqaure is:" +area);
}
}