import java.util.Scanner;
class Table{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int num=s.nextInt();
int[] table=new int[10];
for(int i=1; i<=10; i++){
table[i -1] = num*i;}
for(int i=1; i<=10; i++){
System.out.println(num+ " * " +i+ " = " +table[i-1]);
}
}
}
