
public class PassByValue {
   public static void main(String[] args){
	   int num1=5;
	   int num2=8;
	   swap(num1,num2);
	   System.out.println(num1+","+num2);
   }
   static void swap (int i,int j){
	   int temp;
	   temp=i;
	   i=j;
	   j=temp;
	   System.out.println(i+","+j);
   }
}
