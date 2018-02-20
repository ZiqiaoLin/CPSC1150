
public class Exercise26 {
	public static void main(String[] args){
		int [] arr= new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*99+1);
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		int [] str={0,1,2,3,4,5,6,7,8,9};
		reverse(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
	public static void reverse(int []arr){
		int temp;
		for(int i=0;i<arr.length/2;i++){
			temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
}
