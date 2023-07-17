package org.com.app_management.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.sailu.app_management.entity.AppServiceEntity;
import com.sailu.app_management_util.SessionFactoryUtil;


public class AppServiceHqlRepository 
{
	public List<AppServiceEntity> findAll()
	{
		//String hqlQuery="from UserEntity";
		StringBuilder builder = new StringBuilder();
		builder.append("from AppServiceEntity");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
		return query.getResultList();
	}
	public List<AppServiceEntity> findByServiceName(String serviceName)
	{
		StringBuilder builder = new StringBuilder();
		builder.append("from AppServiceEntity where serviceName=:n");
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
		query.setParameter("n", serviceName);
		return query.getResultList();
	}

	

}
