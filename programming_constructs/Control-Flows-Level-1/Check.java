import java.util.Scanner;
class Check{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the 1");
int num1=s.nextInt();
System.out.println("enter the no.2");
int num2=s.nextInt();
System.out.println("enter the no 3");
int num3=s.nextInt();
if(num1>num2&&num1>num3){
System.out.println("so num1 is greater");
}
else if(num2>num1&&num2>num3){
System.out.println("num2 is greater");
}
else if(num3>num1&&num3>num2){
System.out.println("num3 is greater");
}
else{
System.out.println("none is greater");
}
}
}

