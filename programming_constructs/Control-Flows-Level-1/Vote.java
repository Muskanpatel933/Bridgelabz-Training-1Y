import java.util.Scanner;
class Vote{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the age:");
int age=s.nextInt();
if(age>18){
System.out.println("you can vote");
}
else{
System.out.println("you can't vote");
}
}
}