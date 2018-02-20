/*import java.util.Scanner;
public class ChangeArray {
	public static void main(String[] args){
     int x=10;
     int[] numbers= new int[x];
     x=60;
     Scanner input= new Scanner(System.in);
     for(int i=0;i<numbers.length;i++){
    	 numbers[i]=input.nextInt();
     }
     for(int j=0;j<numbers.length;j++){
    	 System.out.println(numbers[j]);
     }
	}
}*/
import java.util.Scanner;
public class ChangeArray{
	public static void main(String[] args){
		double[] myList= new double[1000];
		int inputArrayLength=0;
		Scanner input= new Scanner(System.in);
		while(input.hasNextDouble()){
			myList[inputArrayLength]=input.nextDouble();
			inputArrayLength++;
		}
		for(int j=0;j<myList.length;j++){
		System.out.println(myList[j]);
		}
	}
}