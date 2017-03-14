package bank;

import java.util.ArrayList;

public class Payment {

	Status status = null;
	ArrayList<Status> steps = new ArrayList<Status>();

	Payment() {

		if (checkAccounts()) {
			steps.add(new Status("INITIALIZED"));
		} else {
			steps.add(new Status(null));

		}
		if (validate()) {
			steps.add(new Status("VALIDATE"));
		} else {
			steps.add(new Status(null));

		}

		if (execute()) {
			steps.add(new Status("EXECUTED"));
		} else {
			steps.add(new Status(null));

		}
	}

	Status submit(Transaction t) {

		Status current = null;
		for (int i = 0; i < steps.size(); ++i) {
			current = steps.get(i);

			if (current != null) {
				System.out.println(current);
				continue;
			} else {
				System.out.println(i);
				break;
			}
		}
		return current;
	}

	boolean initialize() {
		if ((Transaction.getSource() != null) && (Transaction.getTarget() != null)) {
			return validate();
		}
		return false;
	}

	boolean validate() {
		if (Transaction.getSource_sum() > Transaction.getCurrent_summ()) {
			double account_sum = Transaction.getSource_sum();
			double current_sum = Transaction.getCurrent_summ();
			account_sum -= current_sum;

			Transaction.setSource_sum(account_sum);
			return execute();

		}
		return false;
	}

	boolean execute() {
		if (update()) {
			return true;
		}
		return false;
	}

	public boolean update() {
		if (Transaction.getCurrent_summ() > 0) {
			return true;
		}
		return false;
	}

	boolean checkAccounts() {
		if ((Transaction.getSource() != null) && (Transaction.getTarget() != null)) {
			return true;
		}
		return false;
	}

}
