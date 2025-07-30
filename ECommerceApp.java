class PaymentGateway{
	public void makePayment(String cardNum,String expDate,String cvv) {
		System.out.println("Making payment through Credit Card number: "+cardNum+".........");
		System.out.println("Transaction Successfull");	
		System.out.println("Thank you for your service");
	}
	public void makePayment(String upiID) {
		System.out.println("Making payment through UPI: "+upiID+"..........");
		System.out.println("Transaction Successful");
		System.out.println("Thank you for your service");
	}
	public void makePayment(double amount) {
		System.out.println("Evaluating the amount......... ");
		System.out.println("Transaction Successfull");
		System.out.println("Thank you for your service");
	}
}
public class ECommerceApp {
	public static void main(String args[]) {
		PaymentGateway user=new PaymentGateway();
		user.makePayment("4538 5563 2321 1908","12/32","566");
	}

}
