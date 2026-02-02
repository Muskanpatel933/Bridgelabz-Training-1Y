import java.util.Scanner;
class CountDown{
public static void main (String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the number:");
int i=s.nextInt();
while(i>=1){
System.out.println(i);
i--;
}
}
}


