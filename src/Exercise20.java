
public class Exercise20 {
 

		 static int x=5;
		 public static void main(String[] args ){

		 System.out.println(x);
		 f1();
		 System.out.println(x);
		f2(x);
		System.out.println(x);
		 }
		 public static void f1(){
		 int  x =15;
		 System.out.println("This x is "+ x);
		 }

		 public static int f2(int x){
		  x = 7;
		  System.out.println("How about this one "+x);
		 return x;
		 }
		} 

