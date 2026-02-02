import java.util.Scanner;
class FactorialWhile{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
if(n<0){
System.out.println("Factorial is not possible");}
else{
int sum=1;
int i=1;
while(i<=n){
sum*=i;
i++;}
System.out.println("the factorail is:" +sum);}
}
}