
public class Exercise27 {
	public static void main(String[] args){
		char[] arr={'t','e','s','t'};
        rightRotation(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
	public static void leftRotation(char[] arr){
		char temp=arr[0];
		for(int i=1;i<arr.length;i++){
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
	}
	public static void rightRotation(char[] arr){
		char temp=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--){
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
	}
}
