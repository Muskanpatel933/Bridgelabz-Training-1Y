import java.util.Scanner;
class University{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the students fees:");
double fee=s.nextDouble();
System.out.println("enter the discount %");
double discountPercentage=s.nextDouble();
double diS=(fee*discountPercentage)/100;
double disFees= fee-diS;
System.out.println("the final discount amount is:" + diS + "the final discount fee is:" +disFees);
}
}