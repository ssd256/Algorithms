package Level_1;


// 문제 풀이용
public class Lotto_Solution { 
	
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
		
		
}
