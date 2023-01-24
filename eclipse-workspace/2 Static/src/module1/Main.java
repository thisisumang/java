package module1;

public class Main {
	static
	{
		System.out.print("Block 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp temp1 = new Temp(10);
		Temp temp2 = new Temp(100);
		System.out.println(Temp.MaxT);
	}

}
