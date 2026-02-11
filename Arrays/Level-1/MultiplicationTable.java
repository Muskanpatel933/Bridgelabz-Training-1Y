import java.util.Scanner;
class MultiplicationTable{
public static void main(String arsg[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
if(num<6 || num>9){
System.out.println("Invalid");
return;}
int[] mul=new int[10];
for (int i=1; i<=10; i++){
mul[i-1]=num*i;}
for(int i=1;i<=10; i++){
System.out.println(num+" * " +i+ " = " +mul[i-1]);
}
}
}