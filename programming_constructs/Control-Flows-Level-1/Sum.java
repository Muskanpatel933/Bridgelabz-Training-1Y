import java.util.Scanner;
class Sum{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
double total =0.0;
double num;
System.out.println("enter the number");
num=s.nextDouble();
while(num!=0){
total = total+num;
num = s.nextDouble();
}
System.out.println("total sum=" +total);
}
}