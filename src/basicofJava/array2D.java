package basicofJava;

public class array2D {
	
	public static void main(String[] args) {
		//2D array 
		// approch1 fix size and fix data
		int arr[][] = new int[2][2];
		
		arr[0][0] = 20;
		arr[0][1] = 40;
		arr[1][0] = 55;
		arr[1][1] = 29;
		
		//approch2 
		int[][] arr2 = {{10,20},{15,30},{32,20},{21,90}};
		
		//or another 2D array
		int[][] arr3 = {{10,20,23},{15,30,45},{23,34,56}};

		int len= arr2.length;
		
		System.out.println(len);
		
		int rowno = arr2.length;   //4
		int colno = arr2[2].length;  //2
		
		int total = rowno * colno;  //4* 2 = 8
		
		System.out.println("number of rows "+ rowno);
		System.out.println("number of colums "+ colno);
		System.out.println("total number of elelment "+total);
		
		// to print 2D array element
		for(int i=0; i<arr3.length;i++) {
			
			for(int j=0; j<arr3.length; j++) {
				
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
		//for each loop to print 2D elements or array
		
		for(int[] row: arr3) {
			
			for(int col : row) {  
				
				System.out.print(col+" ");	
				
			}
			System.out.println();
			
		}
	}

}
