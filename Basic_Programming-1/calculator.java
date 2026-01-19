import java.util.Scanner;
class calculator{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the value of a:");
int a=s.nextInt();
System.out.println("Enter the value of b:");
int b=s.nextInt();
int add=a+b;
int sub=a-b;
int mul=a*b;
int div=a/b;
System.out.println("Addition:" +add + "Subtraction:" +sub + "multiply:" +mul+ "divison:" +div);
}
}