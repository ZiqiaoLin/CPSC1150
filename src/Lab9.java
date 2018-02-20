/*The Program's Name:Lab9;
**Name: Ziqiao(John) Lin;
**Date of Finish: Nov,19,2015;
**Course:CPSC1150;
**Section:004;
**Compiler:JDK1.7;
*/
public class Lab9{
	/*
	 * This class is to search a number in an array by binary method
	 */
	public static void main(String[] args){
		int[] arr = {3,6,7,12,14,22,24,34,44,46,53,55}; 
		System.out.println("0 => "+binarySearch(arr, 0)); // couple test for binary search
		System.out.println("22 => "+binarySearch(arr, 22));
		System.out.println("26 => "+binarySearch(arr, 26));
		System.out.println("34 => "+binarySearch(arr, 34));
		System.out.println("44 => "+binarySearch(arr, 44));
		System.out.println("51 => "+binarySearch(arr, 51));
		System.out.println("55 => "+binarySearch(arr, 55));
	}
	/*
	 * method binary search is to search a number in array and return its index
	 */
	public static int binarySearch(int[] arr, int num){
		int start=0;  // define start as integer as start point
		int end=arr.length-1;// define end as integer as end point
		int mid;  // define mid as the mid point
		while(start<=end){  // loop for search the number
		    mid=(start+end)/2;  // mid is the mid number of start point and end point
			if(num==arr[mid]){
				return mid;
			}else if(num>arr[mid]){
				start=mid+1;
			}else{
				end=mid-1;
			}
		}
		return -1;
	}

}