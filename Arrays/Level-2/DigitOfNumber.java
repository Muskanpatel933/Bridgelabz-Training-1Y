import java.util.Scanner;
class DigitOfNumber{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int number=s.nextInt();
int maxdigit=10;
int[] digit=new int[maxdigit];
int index=0;
while(number!=0){
digit[index]=number%10;
number=number/10;
index++;
if(index==maxdigit){
break;}}
int largest=0;
int secondLargest=0;
for(int i=0; i<index; i++){
if(digit[i]>largest){
secondLargest=largest;
largest=digit[i];}
else if(digit[i]>secondLargest && digit[i] !=largest){
secondLargest=digit[i];
}}
System.out.println("Largest digit:" +largest);
System.out.println("Second largest digit:" +secondLargest);}}
