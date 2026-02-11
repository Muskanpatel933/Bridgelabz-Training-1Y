import java.util.Scanner;
class FizzBuzzArray{
public static void main(String args[]);
Scanner s=new Scanner(System.in);
System.out.println("Enter the positive num");
int num=s.nextInt();
if(num<=0){
System.out.println("Invalid");
return;}
String result[]=new String[num];
for(int i=1;i<=num;i++){
if(i%3==0&&i%5==0)
{
result[i-1]="FizzBuzz";
}
else if(i%3==0){
result[i-1]="Fizz";}
else if(i%5==0){
result[i-1]="Buzz";}
else{
result[i-1]=String.valueOf(i);}
}
for(String s1:result){
System.out.println(s1);}

}}