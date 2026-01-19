import java.util.Scanner;
class Price{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the unit price:");
int price=s.nextInt();
int quantity=s.nextInt();
int totalPrice=price*quantity;
System.out.println("the total puchase price is:" +totalPrice);
}
}