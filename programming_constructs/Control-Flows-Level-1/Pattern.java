import java.util.Scanner;
class Pattern{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the row number");
int r=s.nextInt();
System.out.println("Enter the column number");
int c=s.nextInt();
for(int i=1;i<=r; i++){
for(int j=1;j<=c;j++){
System.out.print("*");}
System.out.println();
}}}