package dlithe.RManagement;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table
public class RationModel
{
	@Id
	private String RCN;  // Ration card number
	private String RCType; // Ration card type [APL or BPL] 
	private String Quantity; // Quantity given
	private double Cost; // Total cost
	private LocalDate Date; // date of ration items given
	@ManyToOne
	@JoinColumn(name="ItemNo")
	private ItemModel itemmodel;
	
	
	public String getRCN() {
		return RCN;
	}
	public void setRCN(String rCN) {
		RCN = rCN;
	}
	public String getRCType() {
		return RCType;
	}
	public void setRCType(String rCType) {
		RCType = rCType;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public double getCost() {
		return Cost;
	}
	public void setCost(double cost) {
		Cost = cost;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	
	public ItemModel getItemmodel() {
		return itemmodel;
	}
	public void setItemmodel(ItemModel itemmodel) {
		this.itemmodel = itemmodel;
	}
	@Override
	public String toString() {
		return "RationModel [RCN=" + RCN + ", RCType=" + RCType + ", Quantity=" + Quantity + ", Cost=" + Cost
				+ ", Date=" + Date + ", itemmodel=" + itemmodel + "]";
	}
	
	private RationModel() {}
	
	public RationModel(String rCN, String rCType, String quantity, double cost, String date, ItemModel itemmodel) {
		super();
		RCN = rCN;
		RCType = rCType;
		Quantity = quantity;
		Cost = cost;
		Date = LocalDate.parse(date);
		this.itemmodel = itemmodel;
	}
	
	public RationModel(String rCN) 
	{
		RCN = rCN;		
	}
	
}

