
public class Bank {
	
	int Bankid;
	String bankName;
	String bankifsc;
	BankDetails[] bankdetails;
	public int getBankid() {
		return Bankid;
	}
	public void setBankid(int bankid) {
		Bankid = bankid;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankifsc() {
		return bankifsc;
	}
	public void setBankifsc(String bankifsc) {
		this.bankifsc = bankifsc;
	}
	public BankDetails[] getBankdetails() {
		return bankdetails;
	}
	public void setBankdetails(BankDetails[] bankdetails) {
		this.bankdetails = bankdetails;
	}
	public Bank(int bankid, String bankName, String bankifsc, BankDetails[] bankdetails) {
		super();
		Bankid = bankid;
		this.bankName = bankName;
		this.bankifsc = bankifsc;
		this.bankdetails = bankdetails;
	}
	public Bank() {
	
	}

}
