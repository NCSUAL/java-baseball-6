package baseball.model;

//immutable
public class Userball {
	
	private final String baseball;
	
	public Userball(final String baseball) {
		this.baseball = baseball;
	}
	
	public static Userball of(final String input) {
		return new Userball(input);
	}
	
	public String getUserBall() {
		return this.baseball;
	}
	
	@Override
	public String toString() {
		return baseball;
	}
}
