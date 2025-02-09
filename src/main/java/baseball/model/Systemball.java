package baseball.model;

import java.util.HashSet;
import java.util.LinkedHashSet;

import camp.nextstep.edu.missionutils.Randoms;

public class Systemball {
	
	private HashSet<Integer> baseball = new LinkedHashSet<Integer>();
	
	public Systemball() {
		setBaseball();
	}
	
	private void setBaseball() {
		while(baseball.size()<3) {
			baseball.add(Randoms.pickNumberInRange(1, 9));
		}
	}
	
	public Integer[] getBaseball() {
		return baseball.toArray(Integer[]:: new);
	}
}
