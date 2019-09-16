package dlithe.RManagement;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table
public class FamilyModel 
{
	@Id
	private int HouseNo;
	private String PName;
	private String Address;
	private String Occupation;
	private double AnnualIncome;
	private String Email;
	@OneToOne
	@JoinColumn(name="RCN")
	private RationModel RCN;  //Ration Card Number;
	
	
	public int getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(int houseNo) {
		HouseNo = houseNo;
	}
	public String getPName() {
		return PName;
	}
	public void setPName(String pName) {
		PName = pName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public double getAnnualIncome() {
		return AnnualIncome;
	}
	public void setAnnualIncome(double annualIncome) {
		AnnualIncome = annualIncome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public RationModel getRCN() {
		return RCN;
	}
	public void setRCN(RationModel rCN) {
		RCN = rCN;
	}
	
	
	@Override
	public String toString() {
		return "FamilyModel [HouseNo=" + HouseNo + ", PName=" + PName + ", Address=" + Address
				+ ", Occupation=" + Occupation + ", AnnualIncome=" + AnnualIncome + ", Email=" + Email + ", RCN=" + RCN
				+ "]";
	}
	
	public FamilyModel() {}
	
	public FamilyModel(int houseNo, String pName, String address, String occupation, double annualIncome,
			String email, RationModel rCN) {
		super();
		HouseNo = houseNo;
		PName = pName;
		Address = address;
		Occupation = occupation;
		AnnualIncome = annualIncome;
		Email = email;
		RCN = rCN;
	}	
	
	public FamilyModel(int houseNo) 
	{
		HouseNo = houseNo;
	}
}
