package baseball.utils;

import baseball.dto.CompareDto;
import baseball.model.Systemball;
import baseball.model.Userball;

public class BaseballUtil {

	
	public static CompareDto compareBaseball(final Userball userball, final Systemball systemball) {
		final boolean[] used = new boolean[10]; 
		final boolean[] use = new boolean[10];
		char[] ub = userball.getUserBall().toCharArray();
		Integer[] sb = systemball.getBaseball();
		
		int strike = 0; 
		for(int a=0; a<ub.length; a++) {
			if(ub[a]-48 == sb[a]) {
				used[ub[a]-48] = true;
				strike +=1;
			}
			use[ub[a]-48] = true;
		}
		
		int ball = 0;
		for(int arg: sb) {
			if(used[arg]) {
				continue;
			}
			if(use[arg]) {
				ball++;
			}
		}
		
		return CompareDto.of(strike, ball);
	}
}
