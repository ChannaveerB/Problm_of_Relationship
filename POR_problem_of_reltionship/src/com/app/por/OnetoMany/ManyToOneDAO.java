package com.app.por.OnetoMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.singleton.SingleTonUtil;



public class ManyToOneDAO {

	
	public static void main(String[] args) {
		
		
		ProblemDTO prob3=new ProblemDTO();
		prob3.setType("Visa");
		prob3.setDuration(2);
		
		ProblemDTO prob4=new ProblemDTO();
		prob4.setType("CBI");
		prob4.setDuration(5);
		
	
		
		SessionFactory sf=SingleTonUtil.getSF();
		Session sess=sf.openSession();
		
		//loadthe associated entity from db
		PersonDTO person=sess.load(PersonDTO.class, 1l);
		
		
		//relate problems with a person
		prob3.setPerson(person);
		prob4.setPerson(person);
		
		sess.save(prob3);
		sess.save(prob4);
		
		sess.beginTransaction().commit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
