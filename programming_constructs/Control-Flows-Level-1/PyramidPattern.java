import java.util.Scanner;
class PyramidPattern{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the row number");
int r=s.nextInt();
for(int i=1;i<=r; i++){
for(int j=1; j<=r-i;j++){
System.out.print(" ");}	
for(int k= 1;k<=2*i-1; k++){
System.out.print("*");}
System.out.println();
}}}