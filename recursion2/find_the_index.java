package recursion2;

public class find_the_index {
	
	public static int printindex(int[] arr , int vidx ,int target) {
		
		if(arr.length == vidx) {
			return  -1;
		}
		
		if(arr[vidx] == target) {
			return vidx;
		}
		 
		int rr = printindex(arr, vidx + 1 , target);
		return rr;
		
	}

	public static void main(String[] args) {
             
		int[] arr = {4,3,6,2,4,3};
		int vidx = 0;
		int taget = 12;
		int result = printindex(arr, vidx, taget);
		System.out.println(result);
	}

}
