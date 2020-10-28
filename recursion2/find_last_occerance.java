package recursion2;

public class find_last_occerance {
	
	public static int lastocerance(int[] arr , int vidx , int data) {
		    
		 if(vidx ==arr.length) {
			 return -1;
		 }
		
		 int rr = lastocerance(arr, vidx + 1 , data);
		 
		 if(rr != -1) {
             return rr;			 
		 }
		 
		 else {
			 if(arr[vidx] == data) {
				 return vidx;
			 }
			 
			 else {
				 return -1;
			 }
		 }
	}

	public static void main(String[] args) {
        
		 int[] arr = { 3, 2, 4, 2, 5, 2, 1 };
		 
		 int vidx = 0;
		 int data = 2;
		 
		 int result = lastocerance(arr,vidx,data);
		 System.out.println(result);
		 
	}

}
