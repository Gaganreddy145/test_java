package example_question_tcs_ipa;

public class Sim {
	private int simId;
	private String customerName, circle;
	private double balance, ratePerSec;

	public Sim(int simId, String customerName, String circle, double balance, double ratePerSec) {
		super();
		this.simId = simId;
		this.customerName = customerName;
		this.circle = circle;
		this.balance = balance;
		this.ratePerSec = ratePerSec;
	}

	public int getSimId() {
		return simId;
	}

	public void setSimId(int simId) {
		this.simId = simId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getRatePerSec() {
		return ratePerSec;
	}

	public void setRatePerSec(double ratePerSec) {
		this.ratePerSec = ratePerSec;
	}

}
