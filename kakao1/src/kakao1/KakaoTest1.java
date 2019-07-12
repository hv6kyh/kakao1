package kakao1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KakaoTest1 {	
	
	private static String[] record = {
			"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"
	};
	
	// �߻��� �̺�Ʈ���� ���
	private static ArrayList<Events> arrList = new ArrayList<>();
	
	// ���� ���̵�� �г����� ����
	private static Map<String, String> userMap = new HashMap<>();
	
	// ��ū ���
	private static String[] token;
	
	
	
	public static void main(String args[]) {
		
		for (int i = 0; i < record.length; i++) {
			
			token = record[i].split(" ");
			
			// ���� ���� ���� (uid, uname ����)
			switch (token[0]) {
			
			case "Enter" :
				userMap.put(token[1], token[2]);		// ���� �߰�
				break;
				
			case "Leave" :
				userMap.remove(token[1]);				// ���� ����
				break;
				
			case "Change" :
				userMap.replace(token[1], token[2]);	// �г��� ����
				break;
			
			default:
				break;
			
			}
			
			// �̺�Ʈ ���
			arrList.add(new Events(token[0], token[1]));
			
		}
		
		for (int i = 0; i < arrList.size(); i++) {
			
			Events ent = arrList.get(i);
			
			switch (ent.getEvent()) {
			
			case "Enter" :
				System.out.printf("%s���� ���Խ��ϴ�.\n", userMap.get(ent.getUid()));
				break;
				
			case "Leave" :
				System.out.printf("%s���� �������ϴ�.\n", userMap.get(ent.getUid()));
				break;
			
			}
			
		}
		
	}
	
}