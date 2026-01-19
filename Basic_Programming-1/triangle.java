import java.util.Scanner;
class Triangle{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int base=s.nextInt();
int height=s.nextInt();
double areaInch=(1/2)*base*height;
double areaCm=areaInch*0.39;
System.out.println(" the area of traingle into inch is:" + areaInch + "the area into cm is:" + areaCm);
}
}
