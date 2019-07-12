package kakao1;

public class ChangeUser {
	
	public static String changeUser(User user, String uname) {
		
		user.setUname(uname);
		
		return String.format("Leave %s %s", user.getUid(), user.getUname());
	}

}
