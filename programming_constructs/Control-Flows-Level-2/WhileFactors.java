import java.util.Scanner;
class WhileFactors{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
if(num>0){
int i=1;
while( i<= num ){
if(num%i==0){
System.out.println(+i);
} 
i++;
}
}
else{
System.out.println("Enter a positive num");
}
}
}