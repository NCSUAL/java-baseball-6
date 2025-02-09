package baseball.dto;

import baseball.constant.Result;
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
	
	public int getStrike() {
		return this.strike;
	}
	
	public int getBall() {
		return this.ball;
	}
	
	public boolean isThreeStrike() {
		return this.strike==3;
	}
	
	@Override
	public String toString() {
		if(this.ball > 0 && this.strike>0) {
			return Integer.toString(this.ball)+Result.Ball+Result.GAP+Integer.toString(this.strike)+Result.STRIKE;
		}
		if(this.ball>0) {
			return Integer.toString(this.ball)+Result.Ball;
		}
		if(this.strike>0) {
			return Integer.toString(this.strike)+Result.STRIKE;
		}
		return Result.NOTING.toString();
	}
}
