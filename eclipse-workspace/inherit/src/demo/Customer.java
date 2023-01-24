package demo;

public abstract class Customer {
	String customerID, customerName, customerType;
	double amount;
	public Customer(String cid, String name, String type, double amt) {
		// TODO Auto-generated constructor stub
		customerID = cid;
		customerName = name;
		customerType = type;
		amount = amt;
	}

	void showCustomer(){
		System.out.println(customerID+customerName+customerType+amount);
	}
	abstract double get_final_amount(double interest, int year);

}
