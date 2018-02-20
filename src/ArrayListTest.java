import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
	public static void main(String[] args){
		ArrayList<String> str = new ArrayList<String>();
		str.add("123");
		str.add("456");
		str.add("789");
		for(String str1: str){
			System.out.println(str1);
		}
	}
	
}
