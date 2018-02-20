
public class Compare {
 public static void main(String[] args){
	 int i1=5;
	 int i2=8;
	 int i3=10;
	 double result=compare(i1,i2);
	 System.out.println(result);
	 }
 static double compare(double num1,double num2){
	 if(num1>num2){
		 return num1;
	 }else{
		 return num2;
	 }
 }
}

