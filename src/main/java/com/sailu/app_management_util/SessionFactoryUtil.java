package com.sailu.app_management_util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sailu.app_management.entity.AppServiceEntity;

public class SessionFactoryUtil 
{
	private static SessionFactory sessionFactory=null;
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory==null)
		{
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			cfg.addAnnotatedClass((AppServiceEntity.class));
			sessionFactory =cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

}
