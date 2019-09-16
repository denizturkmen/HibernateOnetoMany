package com.denizturkmen.Client;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.denizturkmen.Entity.Adress;
import com.denizturkmen.Entity.Employee;
import com.denizturkmen.Util.HibernateUtil;

public class SaveClientTest {

	public static void main(String[] args) {
		
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			session.beginTransaction();
	    	
			Employee employee= new Employee();
			employee.setEmployeeName("Deniz Türkmen");
			employee.setEmail("turkmen@gmail.com");
			employee.setSalary(50000.00);
			employee.setDoj(new Date());
			
			Adress address1 = new Adress();
			address1.setCity("Ankara");
			address1.setPin_code(9087727L);
			address1.setState("Söğüt");
			address1.setStreet("Park Cadess");
			
			Adress address2 = new Adress();
			address2.setCity("istanbul");
			address2.setPin_code(610000L);
			address2.setState("Uskudar");
			address2.setStreet("Uskudar Street");
			
			employee.getAddressList().add(address1);
			employee.getAddressList().add(address2);
			
			address1.setEmployee(employee);
			address2.setEmployee(employee);
			
			session.persist(employee);
			
			session.getTransaction().commit();
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	  }


	

}
