package baseball;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.HashSet;
import java.util.LinkedHashSet;

import org.junit.jupiter.api.Test;

import baseball.constant.Log;
import baseball.dto.CompareDto;
import baseball.model.Systemball;
import baseball.model.Userball;
import baseball.utils.BaseballUtil;

public class BaseballTest {
	
	@Test
	public void 사용자_컴퓨터_비교메서드_검증() {
		Userball userball = Userball.of("123");
		System.out.print(Log.USERINFOTEST);
		System.out.println(userball.toString());
		
		HashSet<Integer> hashSet = new LinkedHashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(4);
		
		Systemball systemball = Systemball.of(hashSet);
		System.out.print(Log.SYSTEMBALLINFOTEST);
		System.out.println(systemball.toString());
		
		//CompareDto of(final int strike, final int ball) 
		CompareDto compareDto = CompareDto.of(2, 0);
		
		assertThat(BaseballUtil.compareBaseball(userball, systemball)).isEqualTo(compareDto);
	}
}
