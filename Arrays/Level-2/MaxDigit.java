import java.util.Scanner;
class MaxDigit{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int number=s.nextInt();
int maxDigit=10;
int[] digit=new int[maxDigit];
int index=0;
while(number!=0){
if(index==maxDigit){
maxDigit=maxDigit*2;
int[] temp=new int[maxDigit];
for(int i=0; i<digit.length; i++){
temp[i] =digit[i];}
digit=temp;}
digit[index]=number%10;
number/=10;
index++;}
int largest =0;
int secondLargest=0;
for(int i=0;i<index;i++){
if(digit[i]>largest){
secondLargest=largest;
largest=digit[i];}
else if(digit[i]>secondLargest && digit[i]!=largest){
secondLargest=digit[i];}}
System.out.println("largest digit:" +largest);
System.out.println("Second largest digit:" +secondLargest);
}}