package baseball.model;


//immutable
public class Userball {
	
	private final String userBall;
	
	public Userball(final String userBall) {
		this.userBall = userBall;
	}
	
	public static Userball of(final String input) {
		return new Userball(input);
	}
	
	public String getUserBall() {
		return this.userBall;
	}
}
