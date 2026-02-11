import java.util.Scanner;
class NaturalNumber{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
if(num<=0){
System.out.println("Error");
return;}
int size=num/2+1;
int[] odd =new int[size];
int[] even=new int[size];
 int oddIndex=0;
 int evenIndex=0;
 for(int i=1; i<=num; i++){
 if(i%2==0){
 even[evenIndex]=i;
 evenIndex++;}
 else{
 odd[oddIndex]=i;
 oddIndex++;}}
 System.out.print("odd numbers:" );
 for(int i=0; i< oddIndex; i++){
 System.out.print(odd[i]+ " ");}
 System.out.print("\nEven number:");
 for(int i=0; i<evenIndex; i++){
 System.out.print(even[i]+ " ");}}}

