package module;

public class UserDefinedException extends Exception {
	String str;
	UserDefinedException(String str){
		super(str);
		this.str = str;
	}
	@Override
	public String toString() {
		return str;
		
	}
}