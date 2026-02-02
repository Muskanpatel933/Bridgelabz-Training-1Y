import java.util.Scanner;
class PowerOFNum{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
System.out.println("enter the power");
int pow=s.nextInt();
int result=1;
for(int i=1; i<=pow; i++){
result*=num;}
System.out.println(num+ "raised to the power " +pow+ "is" + result);}
}
