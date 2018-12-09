package com.example.demo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.beans.Details2;
import com.example.demo.beans.Property;
import com.example.demo.domain.Details2Repository;
import com.example.demo.domain.PropertyRepository;

//import com.example.demo.domain.JpaBasedDomain;
@Service
public class Details2Service {

	@Autowired
	private Details2Repository details2Repository;

	 @Autowired
	 private PropertyRepository propertyRepository;

	public List<Details2> getDetails2Service(int eid) {

		return (List<Details2>) details2Repository.findByPropertyLid(eid);
	}

	public void putDetails2Service(Details2 details2) {

		details2Repository.save(details2);

	}

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
	EntityManager em = emf.createEntityManager();

	public Details2 getByJpa() {
		em.getTransaction().begin();
		Details2 d = em.find(Details2.class, 11521174);
		em.getTransaction().commit();

		return d;
	}

	public void putPropertyService(Property property) {
		
		propertyRepository.save(property); 
		
	}


}
