import java.util.Scanner;
class SumOfNeg{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
double total =0.0;
while(true) {
System.out.println("enter the number");
double num=s.nextDouble();
if(num<=0){
break;
}
total = total+num;
}
System.out.println("total sum=" +total);
}
}
