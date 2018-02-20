public class Swap{
public static void main(String[] args) {
int Num1=5;
int Num2=8;
swap(Num1, Num2);
System.out.println(Num1+":"+Num2);
}
static void swap(int Num1, int Num2){
int temp = Num1;
Num1 = Num2;
Num2 = temp;
System.out.println(Num1+":"+Num2);
}
}