import java.util.Scanner;
class Divisible{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int a=s.nextInt();
if(a%5==0){
System.out.println("divisible");
}
else{
System.out.println("not divisible");
}
}
}