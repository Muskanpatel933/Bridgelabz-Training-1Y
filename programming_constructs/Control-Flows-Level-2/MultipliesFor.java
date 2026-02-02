import java.util.Scanner;
class MultipliesFor{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
int num=s.nextInt();
if(num>0 && num<100){
for(int i=100; i>=1; i--){ 
if(i%num==0){
System.out.println(+i);
continue;
}
}
}
else{
System.out.println("enter a postive number less then 100");
}
}
} 