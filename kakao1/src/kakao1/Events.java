package kakao1;

public class Events {
	
	@Override
	public String toString() {
		return "Events [event=" + event + ", uid=" + uid + "]";
	}
	private String event;
	private String uid;
	
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public Events(String event, String uid) {
		super();
		this.event = event;
		this.uid = uid;
	}

	
	

}
