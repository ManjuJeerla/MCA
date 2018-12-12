package com.nt.minidatabase;

public class AccountBean {
	
	private long accNum;
	private String accHName;
	private double balance;
	private String accType;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public String getAccHName() {
		return accHName;
	}
	public void setAccHName(String accHName) {
		this.accHName = accHName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}

@Override
public boolean equals(Object obj) {
	if(obj instanceof AccountBean) {
		AccountBean ab=new AccountBean();
		return this.accNum==ab.accNum && this.accType.equals(ab.accType);
	}
return false;
}

}
