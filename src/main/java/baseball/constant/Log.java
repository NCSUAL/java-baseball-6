package baseball.constant;

import baseball.dto.CompareDto;

public enum Log {
	
	STARTINFO("숫자 야구 게임을 시작합니다.",Status.INFO),
	INPUTINFO("숫자를 입력해주세요 : ",Status.INFO),
	RESULTINFO("3개의 숫자를 모두 맞히셨습니다! 게임 종료",Status.INFO),
	ENDINFO("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.",Status.INFO),
	
	RESULTNUMBERINPUTERROR("유효한 값이 아닙니다. 1~2 수를 입력해야 합니다. ", Status.ERROR),
	NUMBERINPUTERROR("유효한 값이 아닙니다. 1~9 수를 입력해야 합니다. ", Status.ERROR),
	NUMBERVALIDERROR("서로 다른 3자리의 수를 입력해야 합니다.", Status.ERROR),
	
	SYSTEMBALLINFOTEST("시스템이 뽑은 숫자: ",Status.TEST),
	USERINFOTEST("사용자가 뽑은 숫자: ",Status.TEST),
	
	EXIT("프로그램을 종료합니다..",Status.EXIT);
	
	private final String message;
	
	Log(String message, Status status){
		this.message = status + message;
	}
	
	public static String compareInfo(CompareDto compare) {
		return Status.INFO + compare.toString();
	}
	
	@Override
	public String toString() {
		return this.message;
	}
	
}
