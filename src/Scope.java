
public class Scope {
  public static void main(){
	  int x=5;
	  f1();
	  f2();
	  System.out.println(x);
	  return;
  }
  static void f1(){
	  int x=6;
	  System.out.println(x);
  }
  static int f2(){
	  int x=7;
	  return x;
  }
}
