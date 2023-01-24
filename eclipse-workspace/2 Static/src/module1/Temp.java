package module1;

public class Temp {
	private int t;
	public static int MaxT = 0;
	public Temp(int t) {
		if(t>MaxT) MaxT = t;
		this.t = t;
	}
}
