package recursion2;

public class maximum_in_array {

	public static int maximum(int[] arr ,int vidx) {
		if(vidx == arr.length-1) {
			return arr[vidx];
		}
	
		
		int rr = maximum(arr , vidx+1);
		
		if(rr > arr[vidx]) {
			return rr;
		}
		
		else {
			return arr[vidx];
		}
		
		
	}
	public static void main(String[] args) {
         
		int[] arr = {12,5,3,7,45,4,4,9};
		
		int vidx  = 0;
		
		int result = maximum(arr,vidx);
		System.out.println(result);
		   
	}

}
