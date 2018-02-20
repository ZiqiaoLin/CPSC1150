public class Unary_Bug{
	public static void main(String[]args){
		int a=5;
		int x=5+ ++a +2+a+a++;
		System.out.println("x="+x+"a="+a);
	}
}