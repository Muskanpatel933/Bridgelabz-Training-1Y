import java.util.Scanner;
class Smaller{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the num1");
int num1=s.nextInt();
System.out.println("enter the num2");
int num2=s.nextInt();
System.out.println("enter the num3");
int num3=s.nextInt();
if(num1<num2&&num1<num3){
System.out.println("num1 is smaller");
}
else if(num2<num1&&num2<num3){
System.out.println("num2 is smaller");
}
else if(num3<num1&&num3<num2){
System.out.println("num3 is smaller");
}
else{
System.out.println("nothing is smaller");
}
}
}
