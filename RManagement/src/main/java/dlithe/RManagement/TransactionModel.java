package dlithe.RManagement;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
@Table
public class TransactionModel 
{
	@Id  @GeneratedValue(strategy=GenerationType.AUTO)
	private int TNo;
	@OneToOne
	@JoinColumn(name="HouseNo")
	private FamilyModel HouseNo;
	
	
	public int getTNo() {
		return TNo;
	}
	public void setTNo(int tNo) {
		TNo = tNo;
	}
	public FamilyModel getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(FamilyModel houseNo) {
		HouseNo = houseNo;
	}
	

	
	@Override
	public String toString() {
		return "TransactionModel [TNo=" + TNo + ", HouseNo=" + HouseNo + "]";
	}
	public TransactionModel() {}
	
	public TransactionModel(FamilyModel houseNo) {
		super();
	
		HouseNo = houseNo;
	}
	
	
}

