package baseball.constant;

public enum Log {
	
	STARTINFO("숫자 야구 게임을 시작합니다.",Status.INFO),
	INPUTINFO("숫자를 입력해주세요 : ",Status.INFO),
	NUMBERINPUTERROR("유효한 값이 아닙니다. 1~9 수를 입력해야 합니다. ", Status.ERROR),
	NUMBERVALIDERROR("서로 다른 3자리의 수를 입력해야 합니다.", Status.ERROR);
	
	private final String message;
	
	Log(String message, Status status){
		this.message = status.getStatus() + message;
	}
	
	public String getMessage() {
		return this.message;
	}
	

}
