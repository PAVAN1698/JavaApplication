package dlithe.RManagement;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class TransactionImplementation 
{
	
	SessionFactory factory = null;
	Session session =null;
	
	public void CreateTransaction()
	{
		/*
		 * RationModel rm1= new RationModel("RC001"); RationModel rm2= new
		 * RationModel("RC002"); RationModel rm3= new RationModel("RC003"); RationModel
		 * rm4= new RationModel("RC004"); RationModel rm5= new RationModel("RC005");
		 * RationModel rm6= new RationModel("RC006");
		 * 
		 * ItemModel i1 = new ItemModel("Sugar", "500 kg"); ItemModel i2 = new
		 * ItemModel("Rice", "1000 kg"); ItemModel i3 = new ItemModel("Wheat",
		 * "800 kg"); ItemModel i4 = new ItemModel("Kerosene", "1000 Ltr"); ItemModel i6
		 * = new ItemModel("Ragi", "500 kg");
		 */
		
		FamilyModel f1 = new FamilyModel(1);
		FamilyModel f2 = new FamilyModel(2);
		FamilyModel f3 = new FamilyModel(3);
		FamilyModel f4 = new FamilyModel(4);
		FamilyModel f5 = new FamilyModel(5);
		FamilyModel f6 = new FamilyModel(6);
		
		factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
		
    	TransactionModel t1 = new TransactionModel(f1);
    	TransactionModel t2 = new TransactionModel(f2);
    	TransactionModel t3 = new TransactionModel(f3);
    	TransactionModel t4 = new TransactionModel(f4);
    	TransactionModel t5 = new TransactionModel(f5);
    	TransactionModel t6 = new TransactionModel(f6);
    	session.save(t1);session.save(t2);session.save(t3);
    	session.save(t4);session.save(t5);session.save(t6);
	}
	
	public void ListTransaction()
	{
		factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
    	
		Query q = session.createQuery("from TransactionModel");
		List<TransactionModel> pool = q.list();
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
