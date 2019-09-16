package com.spring.banking;

public class Account {
private int Acc_no;
private double Acc_bal;
public int getAcc_no() {
	return Acc_no;
}
public void setAcc_no(int acc_no) {
	Acc_no = acc_no;
}
public double getAcc_bal() {
	return Acc_bal;
}
public void setAcc_bal(double acc_bal) {
	Acc_bal = acc_bal;
}
public Account(int acc_no, double acc_bal) {
	
	Acc_no = acc_no;
	Acc_bal = acc_bal;
}
@Override
public String toString() {
	return "Account [Acc_no=" + Acc_no + ", Acc_bal=" + Acc_bal + "]";
}
public Account() {
	
	// TODO Auto-generated constructor stub
}
}
