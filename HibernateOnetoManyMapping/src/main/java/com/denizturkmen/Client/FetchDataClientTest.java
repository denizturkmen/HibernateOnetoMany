package com.denizturkmen.Client;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.denizturkmen.Entity.Adress;
import com.denizturkmen.Entity.Employee;
import com.denizturkmen.Util.HibernateUtil;

public class FetchDataClientTest {

	public static void main(String[] args) {
		getEmployeeAndAddressbyEmployeeId();
		// getEmployeeAndAddressbyAddressId();

	}

	private static void getEmployeeAndAddressbyAddressId() {

		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Adress address = session.get(Adress.class, 1);
			System.out.println(address);
			if(address != null) {
				System.out.println(address.getEmployee());
			}
			
			
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

	private static void getEmployeeAndAddressbyEmployeeId() {
		
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			Employee employee = session.get(Employee.class, 6);
			System.out.println(employee);
			if(employee != null) {
				employee.getAddressList().forEach(System.out::println);
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}
}
