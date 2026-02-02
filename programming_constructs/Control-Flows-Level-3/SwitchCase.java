import java.util.Scanner;
class SwitchCase{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the first number");
double first=s.nextDouble();
System.out.println("Enter the second number");
double second=s.nextDouble();
System.out.println("Enter opertaor (+,-,*,/):");
char op=s.next().charAt(0);
switch(op){
case'+':
System.out.println("Result =" +(first + second));
break;
case'-':
System.out.println("Result=" +(first - second));
break;
case'*':
System.out.println("Result=" +(first * second));
break;
case'/':
if(second!=0){
System.out.println("Result=" +(first/second));
}else{
System.out.println("Cannot divide by zero");}
break;
default:
System.out.println("Invalid Operator");}}}

