package baseball.constant;

public enum Result {
	
	BALL("볼"),
	STRIKE("스트라이크"),
	NOTING("낫싱"),
	GAP(" ");
	
	private final String element;
	
	Result(final String element){
		this.element = element;
	}
	
	@Override
	public String toString() {
		return this.element;
	}
	
}
