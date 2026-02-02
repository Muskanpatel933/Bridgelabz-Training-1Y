import java.util.Scanner;
class OppositePattern{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the row number");
int r=s.nextInt();
for(int i=1;i<=r; i++){
for(int j=1;j<=(r+1-i);j++ ){
System.out.print("*");}
System.out.println();
}}}