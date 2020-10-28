package recursion2;

public class print_array_using_recursion {
	
	public static void printarray(int[] arr , int vidx) {
		if(vidx == arr.length) {
			return ;	
		}
		
		System.out.println(arr[vidx]);
		printarray(arr , vidx +1);
		
		
		
	}

	public static void main(String[] args) {
        
		 int[] arr = {11,9,23,14,5};
		 
		 int vidx = 0;
		 
		  printarray(arr ,vidx);
	}

}
