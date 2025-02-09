package baseball.valid;

import baseball.constant.Log;

public class InputNumberValidator {
	
	private final String number;
	
	public InputNumberValidator(final String number) {
		this.number = number;
	}
	
	public String numberValidator(){
		formattingValid();
		numberLengthValid();
		numberValueValid();
		numberDuplicationValid();
		return this.number;
	}
	
	public String resultNumberValidator(){
		formattingValid();
		resultNumberLengthValid();
		resultNumberValueValid();
		return this.number;
	}
	
	private void formattingValid() {
		try {
			Integer.parseInt(number);
		}
		catch (NumberFormatException ex) {
			// TODO: handle exception
			throw new IllegalArgumentException(Log.NUMBERINPUTERROR.toString());
		}
	}
	
	private void resultNumberLengthValid() {
		if(this.number.length() != 1) {
			throw new IllegalArgumentException(Log.RESULTNUMBERINPUTERROR.toString());
		}
	}
	
	private void resultNumberValueValid() {
		char c = this.number.charAt(0);
		if(c<49 || c> 57) {
			throw new IllegalArgumentException(Log.RESULTNUMBERINPUTERROR.toString());
		}
	}
	
	
	private void numberLengthValid() {
		if(this.number.length() != 3) {
			throw new IllegalArgumentException(Log.NUMBERVALIDERROR.toString());
		}
	}
	
	private void numberValueValid() {
		for(int a=0; a<this.number.length(); a++) {
			char c = this.number.charAt(a);
			if(c<49 || c>57) {
				throw new IllegalArgumentException(Log.NUMBERINPUTERROR.toString());
			}
		}
	}
	
	private void numberDuplicationValid() {
		final boolean[] array = new boolean[10];
		int number= Integer.parseInt(this.number);
		
		while(number>0) {
			final int index = number%10;
			if(array[index]) {
				throw new IllegalArgumentException(Log.NUMBERVALIDERROR.toString());
			}
			array[index] = true;
			number/=10;
		}
	}
}
