package designPatterns.creationalPattern.singletonPattern;

public class SalaryAccount {
	private long accountNumber;
	private String bankName;
	private double accountBalance;

	private SalaryAccount() {
	}

	private static SalaryAccount salaryAccount = null;

	public static SalaryAccount getInstance() {
		if (salaryAccount == null) {
			setSalaryAccount(new SalaryAccount());
		}

		return getSalaryAccount();
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	private static SalaryAccount getSalaryAccount() {
		return salaryAccount;
	}

	private static void setSalaryAccount(SalaryAccount salaryAccount) {
		SalaryAccount.salaryAccount = salaryAccount;
	}

	@Override
	public String toString() {
		return "SalaryAccount [accountNumber=" + accountNumber + ", bankName=" + bankName + ", accountBalance="
				+ accountBalance + "]";
	}

}
