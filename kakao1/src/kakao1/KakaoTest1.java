package kakao1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KakaoTest1 {	
	
	private static String[] record = {
			"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"
	};
	
	// 발생한 이벤트들을 기록
	private static ArrayList<Events> arrList = new ArrayList<>();
	
	// 유저 아이디와 닉네임을 매핑
	private static Map<String, String> userMap = new HashMap<>();
	
	// 토큰 사용
	private static String[] token;
	
	
	
	public static void main(String args[]) {
		
		for (int i = 0; i < record.length; i++) {
			
			token = record[i].split(" ");
			
			// 유저 정보 관리 (uid, uname 매핑)
			switch (token[0]) {
			
			case "Enter" :
				userMap.put(token[1], token[2]);		// 유저 추가
				break;
				
			case "Leave" :
				userMap.remove(token[1]);				// 유저 삭제
				break;
				
			case "Change" :
				userMap.replace(token[1], token[2]);	// 닉네임 변경
				break;
			
			default:
				break;
			
			}
			
			// 이벤트 기록
			arrList.add(new Events(token[0], token[1]));
			
		}
		
		for (int i = 0; i < arrList.size(); i++) {
			
			Events ent = arrList.get(i);
			
			switch (ent.getEvent()) {
			
			case "Enter" :
				System.out.printf("%s님이 들어왔습니다.\n", userMap.get(ent.getUid()));
				break;
				
			case "Leave" :
				System.out.printf("%s님이 나갔습니다.\n", userMap.get(ent.getUid()));
				break;
			
			}
			
		}
		
	}
	
}