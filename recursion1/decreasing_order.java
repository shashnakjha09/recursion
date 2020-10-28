package recursion1;

public class decreasing_order {
	
	public static void decreasing(int num) {
		if(num == 0) {
			return ;
		}
		System.out.println(num);
		decreasing(num-1);
	}

	public static void main(String[] args) {
            
		int num = 5;
		decreasing(num);
		 
	}

}
