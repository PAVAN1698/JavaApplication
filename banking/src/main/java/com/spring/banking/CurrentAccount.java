package com.spring.banking;

public class CurrentAccount implements Accountoperations {
	private Account cur_acc;
	public CurrentAccount() {
		
		// TODO Auto-generated constructor stub
	}

	public CurrentAccount(Account cur_acc) {
		
		this.cur_acc = cur_acc;
	}

	public Account getCur_acc() {
		return cur_acc;
	}

	public void setCur_acc(Account cur_acc) {
		this.cur_acc = cur_acc;
	}

	public void deposite() {
		// TODO Auto-generated method stub
		double Dep_amt=100000;
		if(Dep_amt>20000) {
		double sa=cur_acc.getAcc_bal();
		double a=Dep_amt + sa;
		cur_acc.setAcc_bal(a);
		System.out.println(cur_acc.toString());
		}
		else
			System.out.println("Deposite Amount should be minimum of 20000");
		System.out.println(cur_acc.toString());
	}

	public void interest() {
		// TODO Auto-generated method stub
		double sa=cur_acc.getAcc_bal();
		double i=sa+(sa*(0/100));
	cur_acc.setAcc_bal(i);
	}

}
