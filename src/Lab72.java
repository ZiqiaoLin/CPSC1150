/*The Program's Name:Lab72;
**Name: Ziqiao(John) Lin;
**Date of Finish: Nov,05,2015;
**Course:CPSC1150;
**Section:004;
**Compiler:JDK1.7;
*/
public class Lab72{  // main class
	public static void main(String[] args){  // main method
		int[] test1={4,6,1,-8,-12,6,1,-12,-12,4,5};
		int[] test2={0, 0, 1, 3, -9, 6, 1, 0, 6};
		int[] test3 ={1}; // The result should be the same array    
		
		// Test case 1:
		System.out.println("Test casse 1:");
		print(test1);
		unique(test1);
		print(test1);
		
		// Test case 2:
		System.out.println("Test casse 2:");
		print(test2);
		unique(test2);
		print(test2);
		
		// Test case 3:
		System.out.println("Test casse 3:");
		print(test3);
		unique(test3);
		print(test3);
	}
	
	/** prints content of array of integers
	@param arr : array of integers
	*/
	public static void print(int[] arr){  // the merhod to print all elements of int array
		int i;
		System.out.print("{");
		for (i=0; i<arr.length; i++){
			if (i==arr.length-1)
				System.out.println(arr[i]+"}");
			else
			System.out.print(arr[i]+","); 
		}
	}
	
	//----------------------
	// Your code:
    
	/** Removes redundant elements of the array without reordering the array.
	fills the rest of the array with zeros.
	@param arr : array of integers
	*/
	 static void unique(int[] arr){  // the void method unique to make sure all elements in array is unique
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){  // if we have same element, the element is going to define a certain value
					arr[i]=9999;
				}
			}
		}
		switchArr(arr);  // calling the switchArr, arr as a pereimeter
		replace(arr);    //calling the replace, arr as a pereimeter
		
	}        
	// Add appropriate helper methods
	 static void switchArr(int[] arr){  // void method switchArr is to put all valued elements to the front of array
		for(int i=0;i<arr.length;i++){
			
			while(arr[i]==9999){
				
				for(int j=i;j<arr.length-1;j++){
					arr[j]=arr[j+1];
				}
				arr[arr.length-1]=99999;
			}
		}

	}
	static void replace(int[] arr){  // void method replace is to value those elements signed by 99999 back to 0
		for(int i=0;i<arr.length;i++){
			if(arr[i]==99999){
				arr[i]=0;
			}
		}
	}
}