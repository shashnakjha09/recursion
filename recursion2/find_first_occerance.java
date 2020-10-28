package recursion2;

public class find_first_occerance {
	
	public static int firstoccerance(int[] arr , int vidx , int data) {
		if(arr.length == vidx) {
			return -1;
		}
		
			if(arr[vidx] == data) {
			return  vidx ;		
		   }
		
		
		int result  = firstoccerance(arr , vidx + 1 , data);
		return result;
		
		
				
	}

	public static void main(String[] args) {
         
		int[] arr = {4,3,5,2,2,1};
		
		int data = 2;
		int vidx = 0;
		int result = firstoccerance(arr, vidx , data);
		
		System.out.println(result);
	}

}
