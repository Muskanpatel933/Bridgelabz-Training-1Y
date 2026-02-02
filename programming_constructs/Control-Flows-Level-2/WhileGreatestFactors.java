import java.util.Scanner;
class WhileGreatestFactors{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
int greatestFactor =1;
int i=num-1;
while( i>=1 ){
if(num%i ==0){
greatestFactor=i;
break;
}
i--;
}
System.out.println("Greatest Factors is" +greatestFactor);
}
}