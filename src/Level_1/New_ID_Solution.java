package Level_1;

/*
	new_id는 길이 1 이상 1,000 이하인 문자열입니다.
	new_id는 알파벳 대문자, 알파벳 소문자, 숫자, 특수문자로 구성되어 있습니다.
	new_id에 나타날 수 있는 특수문자는 -_.~!@#$%^&*()=+[{]}:?,<>/ 로 한정됩니다.
 */

class New_ID_Solution {

	public String solution(String new_id) {
        String tmp = new_id; 
		
		tmp = tmp.toLowerCase();					// 1단계
		tmp = tmp.replaceAll("[^-_.a-z0-9]", "");	// 2단계		특수문자를 먼저 언급하기
		tmp = tmp.replaceAll("[.]{2,}", ".");		// 3단계
		tmp = tmp.replaceAll("^[.]|[.]$", "");	    // 4단계		| 는 or를 뜻함
        
        
        // 5단계
        if(tmp.equals("")) {			// 문자열을 == 아닌 equals 로 비교함
       		tmp += "a";	               
        }
		
		
		int lengthT = tmp.length();
		if( lengthT >= 16 ) {						// 6단계
			tmp = tmp.substring(0, 15);

			lengthT = tmp.length();
			if( tmp.charAt(lengthT - 1) == '.' ) {
				tmp = tmp.replaceAll("^[.]|[.]$","");
			}
		}
		
		
		if( lengthT <= 2 ) {						// 7단계
			int cnt = lengthT;			
			for(; cnt < 3; cnt++) {
				tmp = tmp + tmp.charAt(cnt-1);
			}
		}
        
        String answer = tmp;
        return answer;
    }
	
}
