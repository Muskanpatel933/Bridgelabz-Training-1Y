import java.util.Scanner;
class OddEvenFor{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
int n=s.nextInt();
for(int i=1; i<=n; i++){
	if(i%2==0)
{
System.out.println(i+ "  is even");
}else{
System.out.println(i+ " is odd");}
}
}
}