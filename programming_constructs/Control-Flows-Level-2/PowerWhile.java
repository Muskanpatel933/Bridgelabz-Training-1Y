import java.util.Scanner;
class PowerWhile{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
System.out.println("enter the power");
int pow=s.nextInt();
int result=1;
int i=0;
while(i<pow){
result*=num;
i++;}
System.out.println("Result=" +result);
}
}
