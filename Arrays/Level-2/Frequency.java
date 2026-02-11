import java.util.Scanner;
class Frequency{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
int[] freq=new int[10];
while(num>0){
int digit =num%10;
freq[digit]++;
num/=10;}
System.out.println("\nDigit Frequency:");
for(int i=0;i<10;i++){
if(freq[i]>0){
System.out.println("Digit" +i+ "=" + +freq[i]);
}
}
}
}
