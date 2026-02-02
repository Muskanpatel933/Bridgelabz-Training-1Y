import java.util.Scanner;
class NumberNatural{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
if(n<=0){
System.out.println("Not a natural num");}
else{
int sum=0;
int i=1;
while(i<=n){
sum+=i;
i++;
}
int sumFormula=n*(n+1)/2;
System.out.println("sum using while loop=" +sum);
System.out.println("Sum using formula=" +sumFormula);
if(sum==sumFormula){
System.out.println("result is correct");
}
}
}
}