import java.util.Scanner;
class Harry
{
public static void main(String agrs[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the name :");
String name=s.nextLine();
System.out.println("enter the birth year:");
int year1=s.nextInt();
System.out.println("enter the current year:");
int year2=s.nextInt();
int age=year2-year1;
System.out.println("name is :"+name);
System.out.println("age is:"+age);
}
}