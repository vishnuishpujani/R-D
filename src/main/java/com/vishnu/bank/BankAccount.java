package com.vishnu.bank;
/** this comment is d
 * 
 * @author vishpuja
 * @since 03-10-2018
 *
 */


public abstract class BankAccount {
int accountNo;
String accountHolderName;
double accountBalance;
static int autoAccountNogen;
{
	accountNo=++autoAccountNogen;
}

public BankAccount()
{
	
	accountHolderName="Unknown";
	accountBalance=0;
}


public String getAccountHolderName() {
	return accountHolderName;
}


public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}


public int getAccountNo() {
	return accountNo;
}


public double getAccountBalance() {
	return accountBalance;
}


public BankAccount(String accountHolderName, double accountBalance) {
	super();
	this.accountHolderName = accountHolderName;
	this.accountBalance = accountBalance;
}

@Override
public String toString() {
	return "BankAccount [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountBalance="
			+ accountBalance + "]";
}
public abstract void withdraw(double amount);



}
