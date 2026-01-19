import java.util.Scanner;
class pen{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("the quantity of pens :");
int pen=s.nextInt();
System.out.println("child:");
int child=s.nextInt();
double divison=pen/child;
double mod=pen%child;
System.out.println("the equal distrubtion:" + divison);
System.out.println("the remainder is:" + mod);
}
}