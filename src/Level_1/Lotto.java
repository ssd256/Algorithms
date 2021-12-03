package Level_1;

import java.util.Random;
import java.util.Scanner;


// 다 구현해보기 : 2021.11.28
public class Lotto { 
	
	// Lotto와 Solution 클래스 두 군데 모두 사용해야 하는 변수라서 static에 올려둠
	static int[] lottos   = new int[6];
	static int[] win_nums = new int[6];
	static int[] answer   = new int[2];
	
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			for(int i=0; i<6; i++) {
				lottos[i] = sc.nextInt();
			}
				
			
			Solution s = new Solution();
			win_nums = s.set_win_nums(win_nums);
			for(int i=0; i<6; i++) {
				System.out.print(win_nums[i] + " ");
			}
			
			
			System.out.println();
			
			
			answer = s.solution(lottos, win_nums);
			System.out.print("[" + answer[0] + ", " + answer[1] + "]");
		}
}


class Solution{
	
		public int[] solution(int[] lottos, int[] win_nums) {
			 
	    	int max   	  = 7; 
	    	int min   	  = 7;
	    	int max_count = 0;
	    	int min_count = 0;
	    	int[] answer  = new int[2];
	    	 
	    	for(int i=0; i<6; i++)
	    	{
	    		for(int j=0; j<6; j++)
	    		{ 
	    			if(lottos[i] == win_nums[j])
	    			{
	    				max_count++;
	    				min_count++;
	    			}
	    		}
	    		
	    		if(lottos[i] == 0)
	    		{
	    			max_count++;
	    		}
	    	}
	    	
	    	min = min-min_count;
	    	max = max-max_count;
	    	
	    	if(min_count <= 1)
	    	{
	    		min = 6;
	    	}
	    	
	    	if(max_count <= 1)
	    	{
	    		max = 6;
	    	}
	    	
	    		
	        answer[0] = max;
	    	answer[1] = min;

	    	
	        return answer;
	    }  
		
		
		public int[] set_win_nums(int[] arr) {
			
			Random rd = new Random();
			
			for(int i=0; i<6; i++) {
				arr[i] = (int)(rd.nextInt(45)+1);
			}
			
			return arr;
		}
		
}
