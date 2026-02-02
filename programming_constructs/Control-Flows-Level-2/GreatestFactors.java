import java.util.Scanner;
class GreatestFactors{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
int greatestFactor =1;
for(int i=num-1 ; i>=1; i--){
if(num%i ==0){
greatestFactor=i;
break;
}
}
System.out.println("Greatest Factors is" +greatestFactor);
}
}