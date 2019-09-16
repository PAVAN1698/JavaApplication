package dlithe.RManagement;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class RationImplementation 
{
	SessionFactory factory = null;
	Session session =null;
	
	public void CreateRation()
	{
		ItemModel im1 = new ItemModel(1, "Sugar", "500 kg");
		ItemModel im2 = new ItemModel(2, "Rice", "1000 kg");
		ItemModel im3 = new ItemModel(2, "Rice", "1000 kg");
		ItemModel im4 = new ItemModel(3, "Wheat", "800 kg");
		ItemModel im5 = new ItemModel(4, "Kerosene", "1000 Ltr");
		ItemModel im6 = new ItemModel(6, "Ragi", "500 kg");
		
		factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
				
		RationModel r1 = new RationModel("RC001", "BPL", "2kg", 26.0, "2019-05-21", im1);//1 kg sugar 13 rupees.
		RationModel r2 = new RationModel("RC002", "BPL", "10kg", 50.0, "2019-05-21", im2);//1 kg rice 5 rupees.
		RationModel r3 = new RationModel("RC003", "BPL", "16kg", 80.0, "2019-05-21", im3);
		RationModel r4 = new RationModel("RC004", "APL", "2kg", 20.0, "2019-05-21", im4);//1 kg wheat 10 rupees
		RationModel r5 = new RationModel("RC005", "BPL", "10kg", 50.0, "2019-05-21", im6);//1 kg ragi 5 rupees.
		RationModel r6 = new RationModel("RC006", "BPL", "2 Ltr", 24.0, "2019-05-21", im5);//1 Ltr kerosene 12 rupees
		RationModel r7 = new RationModel("RC007", "BPL", "5kg", 25.0, "2019-05-21", im2);
		RationModel r8 = new RationModel("RC008", "BPL", "5kg", 65.0, "2019-05-21", im1);
		session.save(r1);session.save(r2);session.save(r3);session.save(r4);session.save(r5);
		session.save(r6);session.save(r7);session.save(r8);
	}
	
	public void UpdateRation()
	{
		factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
    	
		RationModel rm = (RationModel)session.get(RationModel.class, "RC005");
		rm.setRCType("APL");
		session.update(rm);
		
	}
	
	public void DeleteRation()
	{
		factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
    	
		RationModel rm = (RationModel)session.get(RationModel.class, "RC008");
		session.delete(rm);
		System.out.println("The deleted item is" +rm);
	}
	
	public void ListRation()
	{
		factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
    	
		Query q = session.createQuery("select RCN from RationModel");
		List<RationModel> pool = q.list();
		System.out.println(pool);
	}
	
	public void end()
	{
		session.getTransaction().commit();
    	session.close();
	}
}

