package basicofJava;

public class arrayDemo1 {
	
	public static void main(String[] args) {
		
		//approch 1 to create and store values in array
		int [] arr1 = new int[5];
		
		arr1[0]= 1;
		arr1[1]= 2;
		arr1[2]= 3;
		arr1[3]= 4;
		arr1[4]= 5;
		
		// approch 2
		int arr2[] = {1,2,3,4,5};
		
		int [] arr3 = {10, 20 ,30, 40, 50, 60 ,80};
		
		System.out.println("1st element of arr3 is: "+ arr3[0]);
		System.out.println("3rd element of arr3 is: "+ arr3[2]);
		System.out.println("last element of arr3 is: "+ arr3[6]);
		
		//print the length of array
		System.out.println("length of arr3 is: "+ arr3.length);  
		
		//print all elements of array
		for(int i=0; i<arr3.length; i++) {
			
			System.out.println(arr3[i]);
		}
		
		// enhance for loop	
		System.out.println("array element using enhance for loop:");
		for(int n: arr3) {
			
			System.out.println(n);
		}
				
	}

}
