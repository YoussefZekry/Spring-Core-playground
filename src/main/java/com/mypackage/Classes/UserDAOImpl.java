package com.mypackage.Classes;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionTemplate;

import com.mypackage.Interfaces.UserDAOInterface;
import com.mypackage.Models.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

public class UserDAOImpl implements UserDAOInterface{
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public Long count() {
		String SQL = "select count(*) from Person";
		Query rowCount = entityManager.createQuery(SQL);
		System.out.println("*********************************************"+rowCount+"*********************************************************");
		return (Long)rowCount.getSingleResult();
		
	}

	

	@Transactional
	@Override
	public void deleteById(int personId) {
		Person person = entityManager.find(Person.class,personId);
		System.out.println("===========");
		System.out.println("person id that needs to be deleted: " + person.getId());
		entityManager.remove(person);
	}

	@Transactional
	@Override
	public void insert(Person person) {
		entityManager.persist(person);
	}

	@Transactional
	@Override
	public void update(Person person) {
		entityManager.merge(person);
	}

	
}
