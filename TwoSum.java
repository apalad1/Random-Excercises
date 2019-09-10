//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.


public class twosum {

	public static void main(String args[]) {
		int[] nums = {2, 7, 11, 15}; int target = 9;
		
		solution(nums, target);
		//System.out.print(juice);
	}
	
	public static int solution(int [] nums, int target) {
		
		int test; 
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4 ; j++) {
				//if same index dont add em
				if(nums[i] != nums[j]) {
					test = nums[i] + nums[j];
					
					System.out.println(test);
					
					if(test == target) {
						System.out.print("index num: " + i + " and " + j);
						i = 4; j = 4;
					}
				}
				
				
			}
			
			System.out.println("");
			
		}
		
		
		return 0;
	}
}
