package baseball.dto;

public class CompareDto {
	private final int strike;
	private final int ball;
	
	public CompareDto(final int strike, final int ball) {
		this.ball = ball;
		this.strike = strike;
	}
	
	public static CompareDto of(final int strike, final int ball) {
		return new CompareDto(strike,ball);
	}
}
