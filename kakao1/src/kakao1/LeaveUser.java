package kakao1;

public class LeaveUser {
	
	public static String leaveUser(User user) {
		
		return String.format("Leave %s", user.getUid());
	}

}
