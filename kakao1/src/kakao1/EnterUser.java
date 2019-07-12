package kakao1;

public class EnterUser {
	
	public static String enterUser(User user) {
		
		return String.format("Enter %s $s", user.getUid(), user.getUname());
	}

}
