package com.sailu.app_management;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.text.DateFormatter;
import org.com.app_management.repository.AppServiceHqlRepository;
import org.com.app_management.repository.AppServiceRepository;
import com.sailu.app_management.entity.AppServiceEntity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hello World!" );
        AppServiceEntity serviceEntity = new AppServiceEntity();
         //serviceEntity.setAltKey(10);
         serviceEntity.setServiceName("jio");
         serviceEntity.setUrl("http://defgnikhitha");
         serviceEntity.setStatus("something good");
     // SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
      // Date date = format.parse("22/02/2010");
       serviceEntity.setCreatedDate("15-march-2015");
      
       serviceEntity.setCreatedBy("Ambani");
        
        //Date date1 = format.parse("22/06/2012");
        serviceEntity.setModifiedDate("10-feb-2022");
        serviceEntity.setModifiedBy("jio managers");
        
        AppServiceHqlRepository repository = new AppServiceHqlRepository();
        //repository.Save(serviceEntity);
        //UserEntity entity = repository.findById(12);
       // System.out.println(entity);
        
        AppServiceHqlRepository hqlRepository = new AppServiceHqlRepository();
    	 /* List<AppServiceEntity> AppServiceEntityList=hqlRepository.findAll();
    	AppServiceEntityList.forEach(each->{
    		System.out.println(each);
	});
    	System.out.println("*********************");*/
    	
//    	List<AppServiceEntity> list = hqlRepository.findByServiceName("jio");
//    	list.forEach(each->
//    	{
//    		System.out.println(each);
//    	});
    }
}
