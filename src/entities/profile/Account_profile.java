package entities.profile;

public class Account_profile {
	private String name;
	private Double cash;
	private String SSN;

	public Account_profile() {
	}

	public Account_profile(Double cash) {
		this.cash = cash;
	}

	public Account_profile(String name, Double cash, String SSN) {
		this.name = name;
		this.cash = cash;
		this.SSN = SSN;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Double getCash() {
		return cash;
	}

	public String getSSN() {
		return SSN;
	}

	public Double deposit(Double cash) {
		return this.cash += cash;
	}

	public Double withdraw(Double cash) {
		return this.cash -= cash;
	}

}
