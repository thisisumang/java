abstract class Car{
	int gear;
	public void print() {
		System.out.println(gear);
	}
	public abstract void fun();
}
public class Main extends Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj = new Main();
		obj.gear=54;
		obj.print();
		
	}
}