package com.sailu.app_management_util;

import java.util.Properties;
public class ConnectionPropertiesUtil 
{
	public static Properties getMysqlDbProperties()
	{
		Properties properties  = new Properties();
		properties.setProperty("connectiom.driver_class", "com.mqsql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/config_db");
		properties.setProperty("hibernate.connection.username", "root"); 
		properties.setProperty("hibernate.connection.password", "root");
		properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
		properties.setProperty("hibernate.show_sql", "true");
		return properties;
	}


}
