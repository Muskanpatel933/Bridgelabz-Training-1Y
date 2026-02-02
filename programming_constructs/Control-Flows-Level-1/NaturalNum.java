import java.util.Scanner;
class NaturalNum{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int n=s.nextInt();
int a=n*(n+1)/2;
if(n>=0){
System.out.println("the sum of " +n+ " is natural number");}
else{
System.out.println("the sum of " +n+ "is not a natural number");}
}
}


