package Level_1;

public class Runner {

	public static void main(String[] args) {
		String answer = "";
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};		// 출전한 선수
		String[] completion  = {"josipa", "filipa", "marina", "nikola"};				// 완주한 선수
		
		String runner = solution(participant, completion);
		System.out.println(runner);
	}
	
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		int j = 0;
		for(int i=0; i<participant.length; i++) {
			while(j < completion.length) {
				if(participant[i].equals(completion[j])) {		// 미완주자가 중간에 있으면 안 걸러짐
					continue;
				}
				else {
					answer = participant[i];	
				}
				
				j++;
				
			}
		}
		
		return answer;	// 완주하지 못한 선수		=> 완주 목록에 없는 선수
		
	}

}
