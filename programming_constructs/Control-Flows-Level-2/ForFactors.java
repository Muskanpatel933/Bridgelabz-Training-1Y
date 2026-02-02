import java.util.Scanner;
class ForFactors{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
if(num>0){
for(int i=1; i<= num ; i++){
if(num%i==0){
System.out.println(+i);}
}
}
else{
System.out.println("Enter a positive num");
}
}
}