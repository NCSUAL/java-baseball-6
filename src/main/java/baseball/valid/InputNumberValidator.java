package baseball.valid;

import baseball.constant.Log;

public class InputNumberValidator {
	
	private final String number;
	
	public InputNumberValidator(final String number) {
		this.number = number;
	}
	
	public String numberValidator(){
		formattingValid();
		lengthValid();
		valueValid();
		duplicationValid();
		return this.number;
	}
	
	private void formattingValid() {
		try {
			Integer.parseInt(number);
		}
		catch (NumberFormatException ex) {
			// TODO: handle exception
			throw new IllegalArgumentException(Log.NUMBERINPUTERROR.getMessage());
		}
	}
	
	private void lengthValid() {
		if(this.number.length() != 3) {
			throw new IllegalArgumentException(Log.NUMBERVALIDERROR.getMessage());
		}
	}
	
	private void valueValid() {
		if(this.number.contains("0")) {
			throw new IllegalArgumentException(Log.NUMBERINPUTERROR.getMessage());
		}
	}
	
	private void duplicationValid() {
		final int[] array = new int[10];
		int number= Integer.parseInt(this.number);
		
		while(number>0) {
			array[number%10] +=1;
			number/=10;
		}
		
		for(int arg: array) {
			if(arg>1) {
				throw new IllegalArgumentException(Log.NUMBERVALIDERROR.getMessage());
			}
		}
	}
}
