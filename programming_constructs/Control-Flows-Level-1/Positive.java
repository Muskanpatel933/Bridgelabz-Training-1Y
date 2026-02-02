import java.util.Scanner;
class Positive{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int a=s.nextInt();
if (a>0){
System.out.println("number is positive:");
}
else if(a<0){
System.out.println("number is negative");
}
else if(a==0){
System.out.println("number is zero");
}
}
}