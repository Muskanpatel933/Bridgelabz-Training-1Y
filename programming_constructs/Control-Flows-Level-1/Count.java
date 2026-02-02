import java.util.Scanner;
class Count{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int i=s.nextInt();
for( ; i>=1; i--){
System.out.println(i);
}
}
}
