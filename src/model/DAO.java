package model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DAO {
	
	public void insertUser(User user){
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();

		s.save(user);

		tr.commit();

	}

	public void insertSeller(Seller slvo){
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();

		s.save(slvo);

		tr.commit();

	}
	
	public List<User> searchUser(User log)
	{
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		List<User> al=new ArrayList<User>();
		try 
		{
			Transaction tr=session.beginTransaction();
			Query q=session.createQuery("from User where un='"+log.getUn()+"'");
			al=q.list();
			tr.commit();
		}

		catch (Exception e) 
		{

				e.printStackTrace();

		}
			return al;

	}
	
	public List<Seller> searchSeller(Seller log)
	{
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		List<Seller> al=new ArrayList<Seller>();
		try 
		{
			Transaction tr=session.beginTransaction();
			Query q=session.createQuery("from Seller where un='"+log.getUn()+"'");
			al=q.list();
			tr.commit();
		}

		catch (Exception e) 
		{

				e.printStackTrace();

		}
			return al;

	}
	
	public List<AdminLoginvo> searchAdmin(AdminLoginvo log)
	{
		SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();

		Session session = sessionFactory.openSession();

		List<AdminLoginvo> al=new ArrayList<AdminLoginvo>();
		try 
		{
			Transaction tr=session.beginTransaction();
			Query q=session.createQuery("from Admin where un='"+log.getUn()+"'");
			al=q.list();
			tr.commit();
		}

		catch (Exception e) 
		{

				e.printStackTrace();

		}
			return al;

	}
	
}
