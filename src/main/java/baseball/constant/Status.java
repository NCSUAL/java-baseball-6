package baseball.constant;

public enum Status {
	
	ERROR("[ERROR] "),
	INFO("[INFO] "),
	TEST("[TEST] "),
	EXIT("[EXIT] ");
	
	private final String status;
	
	Status(String status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return this.status;
	}
}
