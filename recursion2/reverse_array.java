package recursion2;

public class reverse_array {

	public static void printarray(int[] arr , int vidx) {
		if(vidx == arr.length) {
			return ;	
		}
		
		printarray(arr , vidx +1);
		System.out.println(arr[vidx]);
		
		
		
	}

	public static void main(String[] args) {
        
		 int[] arr = {11,9,23,14,5};
		 
		 int vidx = 0;
		 
		  printarray(arr ,vidx);
	}

}
