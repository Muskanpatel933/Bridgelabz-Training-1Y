import java.util.Scanner;
class MultiDimensionalArray{
public static  void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the row num");
int row=s.nextInt();
System.out.println("Enter the column number");
int col=s.nextInt();
int[][] matrix=new int[row][col];
System.out.println("Enter the elements of the matrix:");
for(int i=0;i<row;i++){
for(int j=0; j<col;j++){
matrix[i][j]=s.nextInt();}
}
int[] array=new int[row*col];
int index=0;
for(int i=0; i<row;i++){
for(int j=0;j<col;j++){
array[index]=matrix[i][j];
index++;}}
System.out.println("1D Array:");
for(int i=0; i<index; i++){
System.out.print(array[i]+" ");}}}