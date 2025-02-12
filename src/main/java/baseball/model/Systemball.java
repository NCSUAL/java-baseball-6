package baseball.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

import camp.nextstep.edu.missionutils.Randoms;

public class Systemball {
	
	private HashSet<Integer> baseball;
	
	public Systemball() {
		setBaseball();
	}
	
	public Systemball(HashSet<Integer> baseball) {
		this.baseball = baseball;
	}
	
	private void setBaseball() {
		this.baseball = new LinkedHashSet<Integer>();;
		while(baseball.size()<3) {
			baseball.add(Randoms.pickNumberInRange(1, 9));
		}
	}
	
	public Integer[] getBaseball() {
		return baseball.toArray(Integer[]:: new);
	}
	
	public static Systemball of(HashSet<Integer> baseball) {
		return new Systemball(baseball);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(baseball.toArray());
	}
}
