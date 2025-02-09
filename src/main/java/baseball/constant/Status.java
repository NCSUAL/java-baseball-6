package baseball.constant;

public enum Status {
	
	ERROR("[ERROR] "),
	INFO("[INFO] ");
	
	private final String status;
	
	Status(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
}
