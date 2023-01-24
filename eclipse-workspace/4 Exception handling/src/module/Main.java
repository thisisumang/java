package module;
public class Main {

	public static void main(String[] args) {
		int a =8;
		int b =0;
		int c = 0;
		/*
		int[] arr = new int[5];
		try {
			for(int i=0;i<10;i++) {
				System.out.println(arr[i]);
			}
			c = a/b;
			
		}
//		multiple catch blocks
		catch(ArithmeticException e) {
			System.out.print(e);
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(Exception e) { // Super class of exception should be at the end.
			System.out.println(e.getMessage());
		}
		
		System.out.println(c);
		System.out.println("ok");
		*/
		
		Division div = new Division();
		div.print();
		
	}

}