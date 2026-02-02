import java.util.Scanner;
class FORFactorail{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int n=s.nextInt();
if(n<0){
System.out.println("Factorail is not possibe");}
else{ 
int sum=1;
for(int i=1; i<=n; i++){
sum*=i;}
System.out.println("factorail is :" +sum);}
}
}