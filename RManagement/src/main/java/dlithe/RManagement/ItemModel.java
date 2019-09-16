package dlithe.RManagement;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ItemModel 
{
	@Id  @GeneratedValue(strategy=GenerationType.AUTO)
	private int ItemNo;
	private String IName;
	private String Quantity;
	
	
	public int getItemNo() {
		return ItemNo;
	}
	public void setItemNo(int itemNo) {
		ItemNo = itemNo;
	}
	public String getIName() {
		return IName;
	}
	public void setIName(String iName) {
		IName = iName;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "ItemModel [ItemNo=" + ItemNo + ", IName=" + IName + ", Quantity=" + Quantity + "]";
	}
	
	public ItemModel() {}
	
	public ItemModel(String iName, String quantity) {
		super();
		//ItemNo = itemNo;
		IName = iName;
		Quantity = quantity;
	}
	
	public ItemModel(int itemNo, String iName, String quantity) {
		super();
		ItemNo = itemNo;
		IName = iName;
		Quantity = quantity;
	}
	
		
}

