
public interface Expression {
	String interpret(InterpreterContext ic);
}


class IntToBinaryExpression implements Expression {
	int i;
	
	public IntToBinaryExpression(int i) {
		this.i = i;
	}
	
	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getBinaryFormat(this.i);
	}
}

class IntToHexaDecimalExpression implements Expression {
	int i;
	
	public IntToHexaDecimalExpression(int i) {
		this.i = i;
	}
	
	@Override
	public String interpret(InterpreterContext ic) {
		return ic.getHexadecimalFormat(this.i);
	}
}