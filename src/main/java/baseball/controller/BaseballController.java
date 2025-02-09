package baseball.controller;

import baseball.model.Systemball;
import baseball.model.Userball;
import baseball.view.InputView;
import baseball.view.OutView;

public class BaseballController {
	
	private static Systemball systemBall;
	
	public static void run() {
		//DI(setter)
		setBaseball();
		
		OutView.startInfo();
		OutView.inputInfo();
		
		Userball userball = Userball.of(InputView.inputNumber());
		
	}
	
	private static void setBaseball() {
		systemBall = new Systemball();
	}
}
