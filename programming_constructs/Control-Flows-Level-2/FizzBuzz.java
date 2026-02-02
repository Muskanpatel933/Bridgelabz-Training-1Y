import java.util.Scanner;
class FizzBuzz{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
if(num>0){
for(int i=1; i<=num; i++){
if(i%3==0 && i%5==0){
System.out.println("FizzBuzz");}
else if(i%5==0){
System.out.println("Buzz");}
else if(i%3==0 ){
System.out.println("Fizz");}
else {
System.out.println(i);}
}
}else{
System.out.println("enter the positive number");
}
}
}
