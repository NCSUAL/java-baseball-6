package baseball.dto;

public class ResultDto {
	private int result;
	
	public ResultDto(final int result) {
		this.result = result;
	}
	
	public static ResultDto of(final int result) {
		return new ResultDto(result);
	}
	
	public boolean isRestart() {
		return result == 1;
	}
	
	public boolean isEnd() {
		return result == 2;
	}
}
