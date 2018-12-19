package com.app.por.OnetoMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.singleton.SingleTonUtil;

public class OneToManyDAO {

	public static void main(String[] args) {
		
		
		
		// create an object of Owner(PersonDTO)
		PersonDTO person = new PersonDTO();
		person.setName("VijayaMally");
		person.setBankbalence(20000);
		person.setNationality("India");
		person.setQualification("B.com");
		
		
		//create multiple objects of problem
		ProblemDTO prob1 = new ProblemDTO();
		prob1.setType("Loan");
		prob1.setDuration(10);
		
		ProblemDTO prob2 = new ProblemDTO();
		prob2.setType("Airlines");
		prob2.setDuration(15);
		
		//create collection of problems
		List<ProblemDTO> problems = new ArrayList<>();
		problems.add(prob1);
		problems.add(prob2);
		
		//relate person with multiple problems
		person.setProbs(problems);
		SessionFactory sf = SingleTonUtil.getSF();
		Session sess = sf.openSession();
		sess.save(person);
		sess.beginTransaction().commit();
		
		
		
	}

}
