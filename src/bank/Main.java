package bank;

public class Main {
	public static void main(String[] args) {
		Transaction t = new Transaction(new Account("Darko", "ID:213123"), new Account("Mile", "ID:213123"), 5000.0,0.0);
		
		Payment newPayment = new Payment();
		newPayment.submit(t);

	}
}
