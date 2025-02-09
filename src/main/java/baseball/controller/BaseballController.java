package baseball.controller;
import baseball.dto.CompareDto;
import baseball.model.Systemball;
import baseball.model.Userball;
import static baseball.utils.BaseballUtil.*;
import static baseball.view.InputView.*;
import static baseball.view.OutView.*;

public class BaseballController {
	
	private static Systemball systemball;
	
	public void run() {
		while(play()) {}
	}
	
	private void setBaseball() {
		systemball = new Systemball();
	}
	
	
	private boolean play() {
		//DI(setter)
		setBaseball();
		startInfo();
		while(true) {
			inputInfo();
			Userball userball = Userball.of(inputNumber());
			CompareDto compare = compareBaseball(userball, systemball);
			
			compareInfo(compare);
			
			if(compare.isThreeStrike()) {
				resultInfo();
				if(inputResultNumber().isRestart()) {
					return true;
				}
				exitInfo();
				return false;
			}
		}
	}
	
}
