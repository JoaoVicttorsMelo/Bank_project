package entities.profile;

public class Account_profile {
	private String name;
	private Double cash;
	private String CPF;

	public Account_profile() {
	}

	public Account_profile(Double cash) {
		this.cash = cash;
	}

	public Account_profile(String name, Double cash, String cPF) {
		this.name = name;
		this.cash = cash;
		CPF = cPF;
	}

	public String getName() {
		return name;
	}

	public Double getCash() {
		return cash;
	}

	public void setCash(Double cash) {
		this.cash = cash;
	}

	public String getCPF() {
		return CPF;
	}

	public void deposit(Double cash) {
		this.cash += cash;
	}

	public void withdraw(Double cash) {
		this.cash = -cash;
	}

}
