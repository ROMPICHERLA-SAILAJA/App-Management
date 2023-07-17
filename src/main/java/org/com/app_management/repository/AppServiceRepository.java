package org.com.app_management.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sailu.app_management.entity.AppServiceEntity;
import com.sailu.app_management_util.ConnectionPropertiesUtil;


public class AppServiceRepository 
{
	public void Save(AppServiceEntity userEntity)
	{
		Configuration cfg = new Configuration();
		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		cfg.addAnnotatedClass(AppServiceEntity.class);
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		session.save(userEntity);
		transaction.commit();
	}
	
	public AppServiceEntity findById(long id)
	{
		Configuration cfg = new Configuration();
		cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		cfg.addAnnotatedClass(AppServiceEntity.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		return session.get(AppServiceEntity.class, id);
		
		
	}

}
