import java.util.Scanner;
class BorderPattern{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the row number");
int r=s.nextInt();
System.out.println("Enter the coulumn number");
int c=s.nextInt();
for(int i=1;i<=r; i++){
for(int j=1;j<=c; j++){
if(i==1 || i==r || j==1 || j==c)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
}
}