package baseball.view;

import baseball.dto.ResultDto;
import baseball.valid.InputNumberValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
	
	private static InputNumberValidator inputNumberValidator;
	
	public static String inputNumber() {
		inputNumberValidator = new InputNumberValidator(Console.readLine());
		return inputNumberValidator.numberValidator();
	}
	
	public static ResultDto inputResultNumber() {
		inputNumberValidator = new InputNumberValidator(Console.readLine());
		return ResultDto.of(Integer.parseInt(inputNumberValidator.resultNumberValidator()));
	}
}
