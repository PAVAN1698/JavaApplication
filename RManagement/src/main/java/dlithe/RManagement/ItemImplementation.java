package dlithe.RManagement;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ItemImplementation 
{
	SessionFactory factory = null;
	Session session =null;
	
	public void end()
	{
		session.getTransaction().commit();
    	session.close();
	}
	
	public void CreateItem()
	{
		System.out.println("Welcome to Ration Management");
    	factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
		
		ItemModel i1 = new ItemModel("Sugar", "500 kg");
		ItemModel i2 = new ItemModel("Rice", "1000 kg");
		ItemModel i3 = new ItemModel("Wheat", "800 kg");
		ItemModel i4 = new ItemModel("Kerosene", "1000 Ltr");
		ItemModel i5 = new ItemModel("Oil", "1000 Ltr");
		ItemModel i6 = new ItemModel("Ragi", "500 kg");
		session.save(i1); session.save(i2);
		session.save(i3); session.save(i4);
		session.save(i5); session.save(i6);
	}
	

	public void UpdateItem()
	{
		factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
    	
		ItemModel im =(ItemModel)session.get(ItemModel.class, 6);
		im.setIName("ragi");
		session.update(im);
	}
	
	public void DeleteItem()
	{
		factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
		ItemModel is = (ItemModel)session.get(ItemModel.class, 5);
		session.delete(is);
	}
	
	public void ListItem()
	{
		factory = new Configuration().configure().buildSessionFactory();
    	session = factory.openSession();
    	session.beginTransaction();
		Query q = session.createQuery("select IName from ItemModel");
		List<ItemModel> pool = q.list();
		System.out.println(pool);
	}

		
}
