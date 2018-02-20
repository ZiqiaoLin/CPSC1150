
public class BubbleSort {
	public static void main(String[] args){
		int [] arr={23,7,853,79,246,76,245,0,35,3,74,13,790,34,55};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
	
	public static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
}
