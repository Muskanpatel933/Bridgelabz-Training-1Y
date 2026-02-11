import java.util.Scanner;
class Multiple{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
double[] numbers=new double[10];
double total = 0.0;
int index=0;
while(true){
System.out.println("Enter a number:");
double num=s.nextDouble();
if(num<=0){
break;}
 if(index==10){
 break;}
 numbers[index]=num;
 index++;}
 System.out.println("Entered number:");
 for(int i=0; i<index; i++){
 System.out.println(numbers[i]);
 total=total+numbers[i];
 }
 System.out.println("Total sum ="+total);
 }
 }
 