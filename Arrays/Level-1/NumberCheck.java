import java.util.Scanner;
class NumberCheck{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int[] num=new int[5];
for(int i=0; i<num.length; i++){
System.out.println("Enter the number"  +(i+1)+ ": ");
num[i]=s.nextInt();}
for(int i=0; i<num.length; i++){
if(num[i]>0){
System.out.println( num[i] + " is positive ");
if(num[i]%2==0){
System.out.println(" and even");}
else{
System.out.println("and odd");}
}
else if(num[i]<0){
System.out.println(num[i]+ " is negative");}
else{
System.out.println(num[i]+ " is zero");}}
if(num[0]==num[4]){
System.out.println("First number is equal to last number");}
else if(num[0]>num[4]){
System.out.println("First element is greater then last number");}
else{
System.out.println("First element is less then last number");}}}

