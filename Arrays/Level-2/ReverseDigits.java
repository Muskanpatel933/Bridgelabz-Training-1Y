import java.util.Scanner;
class ReverseDigits{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
int OriginalNum=num;
int count=0;
int temp=num;
if(temp==0) count=1;
while(temp!=0){
temp/=10;
count++;}
int[] digit=new int[count];
temp = num;
for(int i=0;i<count;i++){
digit[i]=temp%10;
temp/=10;}
int[] reveresdDigit=new int[count];
for(int i=0; i<count ; i++){
reveresdDigit[i]=digit[count-1-i];}
System.out.println("Reverse number:");
if(num<0)System.out.print("-");
for(int i=count-1; i>=0; i--){
System.out.print(reveresdDigit[i]);}
System.out.println();
}}