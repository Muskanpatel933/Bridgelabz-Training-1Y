import java.util.Scanner;
class ForNatural{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
if(n<=0){
System.out.println("not a natural number");}
else{
int sum=0;
for(int i=1; i<=n; i++){
sum+=i;}
int sumFormula=n*(n+1)/2;
System.out.println("sum using for loop=" +sum);
System.out.println("sum using the formula=" +sumFormula);
if(sum==sumFormula){
	System.out.println("Result is correct");
}
}
}
}
