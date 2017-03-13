package bank;

public class Transaction {
	static Account source;
	static Account target;
	static double current_sum;
	public static double getCurrent_summ() {
		return current_sum;
	}

	public static void setCurrent_summ(double current_summ) {
		Transaction.current_sum = current_summ;
	}

	static double source_sum;

	public static double getSource_sum() {
		return source_sum;
	}

	public static void setSource_sum(double source_sum) {
		Transaction.source_sum = source_sum;
	}

	public static Account getSource() {
		return source;
	}

	public void setSource(Account source) {
		this.source = source;
	}

	public static Account getTarget() {
		return target;
	}

	public void setTarget(Account target) {
		this.target = target;
	}


	public Transaction(Account source, Account target, double acc_sum, double sum) {
		super();
		this.source = source;
		this.target = target;
		source_sum=acc_sum;
		current_sum= sum;
		
	}

	public String toString() {
		return "" + source + " " + target + " " + current_sum;
	}
}
