
package com.dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContactDAOTest {
	
	private DriverManagerDataSource dataSource;
	private ContactDAO dao;

	@Test
	public void testSave() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contact_db");
		dtatSource.setUsername("root");
		dataSOurce.setPassword("rootmavis");
		
		dao = new ContactDAOImpl(dataSource);
		
		Contact contact = new Contact("NAN","nan@gmail.com","Myanmar","00011112222");
		int result= dao.save(contact);
		
		assertTrue(result >0);
		
	}

	@Test
	public void testUpdate() {
		Contact contact = new Contact(2,"NANG","nang@gmail.com","Myanmar,Lashio","00033332222");
	}
	
	@Test
	public void testGet() {
		Integer id = 1;
		Contact contact = dao.get(id);
		
		if (contact != null) {
			System.out.println(contact);
		}
		
		assertNotNull(contact);
	}
	
	@Test
	public void testDelete() {
		Integer id = 3;
		int result = dao.delete(id);
		
		assertTrue(result > 0);
	}
	
	@Test
	public void testList() {
		List<Contact> listContacts = dao.list();
		
		for (Contact aContact : listContacts) {
			System.out.println(aContact);
		}
		
		assertTrue (!listContacts.isEmpty());
	}
}
