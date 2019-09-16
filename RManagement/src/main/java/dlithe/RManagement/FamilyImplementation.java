package dlithe.RManagement;

import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FamilyImplementation 
{
	SessionFactory factory = null;
	Session session =null;
	
	public void CreateFamily()
	{
		RationModel rm1= new RationModel("RC001");
		RationModel rm2= new RationModel("RC002");
		RationModel rm3= new RationModel("RC003");
		RationModel rm4= new RationModel("RC004");
		RationModel rm5= new RationModel("RC005");
		RationModel rm6= new RationModel("RC006");
		RationModel rm7= new RationModel("RC007");
		
		factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
    	
    	FamilyModel f1 = new FamilyModel(1, "9587462586", "Near Banashankari temple, Badami", "Farmer",
    			27000.00, "akshay@gmail.com", rm1);
    	FamilyModel f2 = new FamilyModel(2, "8660326659", "Opposite to pulkeshi school, Badami", "Business",
    			36000.00, "manju@gmail.com", rm2);
    	FamilyModel f3 = new FamilyModel(3, "9587558742", "Near Ramdurg circle, Badami", "Farmer",
    			22000.00, "sunil@gmail.com", rm3);
    	FamilyModel f4 = new FamilyModel(4, "9980676565", "Near kalidas college, Badami", "Business",
    			40000.00, "harshit@gmail.com", rm4);
    	FamilyModel f5 = new FamilyModel(5, "9966547216", "Opposite to Vijayabank, Badami", "Employee",
    			50000.00, "mahantesh@gmail.com", rm5);
    	FamilyModel f6 = new FamilyModel(6, "8886612488", "Mahatma gandhi road, Badami", "Farmer",
    			23000.00, "arjun@gmail.com", rm6);
    	FamilyModel f7 = new FamilyModel(7, "8897566990", "Near banashankari temple, Badami", "Farmer",
    			26000.00, "anil@gmail.com", rm7);
    	session.save(f1);session.save(f2);session.save(f3);session.save(f4);session.save(f5);session.save(f6);
    	session.save(f7);
	}
	
	public void UpdateFamily()
	{
		factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
    	
		FamilyModel fm = (FamilyModel)session.get(FamilyModel.class, 7);
		fm.setAnnualIncome(24000.00);
		session.update(fm);
		
	}
	
	public void DeleteFamily()
	{
		factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
    	
		FamilyModel fm = (FamilyModel)session.get(FamilyModel.class, 7);
		session.delete(fm);
	}
	
	public void ListFamily()
	{
		factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
    	
		Query q = session.createQuery("from FamilyModel");
		List<FamilyModel> pool = q.list();
		int n = pool.size();
		for(int i=0; i<n; i++)
		{
			System.out.println();
			System.out.println(pool.get(i));
		}
	}
	
	public void end()
	{
		session.getTransaction().commit();
    	session.close();
	}

}
