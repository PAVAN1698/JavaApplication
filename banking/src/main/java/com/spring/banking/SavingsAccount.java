package com.spring.banking;

public  class SavingsAccount implements Accountoperations{
private Account sav_acc;

	public SavingsAccount() {
	
	// TODO Auto-generated constructor stub
}

	public SavingsAccount(Account sav_acc) {
	
	this.sav_acc = sav_acc;
}

	public Account getSav_acc() {
	return sav_acc;
}

public void setSav_acc(Account sav_acc) {
	this.sav_acc = sav_acc;
}

	public void deposite() {
		// TODO Auto-generated method stub
		int Dep_amt=100;
		double sa=sav_acc.getAcc_bal();
		double a=Dep_amt + sa;
		sav_acc.setAcc_bal(a);
		System.out.println(sav_acc.toString());
	}

	public void interest() {
		// TODO Auto-generated method stub
		double sa=sav_acc.getAcc_bal();
		double i=sa+(sa*(6/100));
		sav_acc.setAcc_bal(i);
		System.out.println(sav_acc.toString());
	}

}
