
public class Client {
	public InterpreterContext ic;
	
	public Client(InterpreterContext ic) {
		this.ic = ic;
	}
	
	public String interpret(String str) {
		Expression exp = null;
		if(str.contains("Binary")) {
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(' ')))); 
		} else if(str.contains("Hexadecimal")) {
			exp = new IntToHexaDecimalExpression(Integer.parseInt(str.substring(0, str.indexOf(' '))));
		} else {
			return str;
		}
		return exp.interpret(ic);
	}
	
	public static void main(String args[]) {
		String str1 = "34 in Binary";
		String str2 = "34 in Hexadecimal";
		
		Client client = new Client(new InterpreterContext());
		System.out.println(str1 + " = " + client.interpret(str1));
		System.out.println(str2 + " = " + client.interpret(str2));
	}
}
