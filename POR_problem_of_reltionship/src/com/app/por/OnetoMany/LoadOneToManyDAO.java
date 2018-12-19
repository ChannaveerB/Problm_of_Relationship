package com.app.por.OnetoMany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.singleton.SingleTonUtil;



public class LoadOneToManyDAO {

	public static void main(String[] args) {
		
		SessionFactory sf=SingleTonUtil.getSF();
		Session sess=sf.openSession();
		//loadperson from the database
		PersonDTO person=sess.load(PersonDTO.class, 1l);
		System.out.println(person.getName());
		System.out.println(person.getBankbalence());
		
		//using person obtain the problems
		
		List<ProblemDTO> problems=(List<ProblemDTO>)person.getProbs();
		
		
		for (ProblemDTO problemDTO : problems) {
			System.out.println(problemDTO.getType());
		}
		
		
		
		
		
		
		
		
	}
}
