package baseball.view;
import baseball.constant.Log;
import baseball.dto.CompareDto;

public class OutView {
	
	public static void startInfo() {
		System.out.println(Log.STARTINFO);
	}
	
	public static void inputInfo() {
		System.out.print(Log.INPUTINFO);
	}
	
	public static void resultInfo() {
		System.out.println(Log.RESULTINFO);
		System.out.println(Log.ENDINFO);
	}
	
	public static void compareInfo(CompareDto compare) {
		System.out.println(Log.compareInfo(compare));
	}
	
	public static void exitInfo() {
		System.out.println(Log.EXIT);
	}
	
}