import java.util.Scanner;
class Armstrong{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
int OriginalNum=num;
int sum=0;
while(num!=0){
int digit = num%10;
sum =sum+(digit*digit*digit);
num=num/10;}
if(sum==OriginalNum){
System.out.println(OriginalNum+ "is an Armstrong number");}
else{
System.out.println(OriginalNum+ "is not an Armstrong number");}}}















