import java.util.Scanner;
class FactorsOfNumber{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
int maxFactor=10;
int[] factor=new int[maxFactor];
int index=0;
for(int i=1; i<=num; i++){
if(num%i==0){
if(index==maxFactor){
maxFactor*=2;
int[] temp=new int[maxFactor];
for(int j=0; j<index; j++){
temp[j]=factor[j];}
factor=temp;}
factor[index]=i;
index++;}}
System.out.print("Factors are:");
for(int i=0; i<index; i++){
System.out.print(factor[i]+ " ");}}}

