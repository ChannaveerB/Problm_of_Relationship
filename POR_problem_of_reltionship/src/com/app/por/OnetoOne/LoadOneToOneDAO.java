package com.app.por.OnetoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.singleton.SingleTonUtil;

public class LoadOneToOneDAO {

	public static void main(String[] args) {
		SessionFactory sf = SingleTonUtil.getSF();
		Session sess = sf.openSession();
		
	StateDTO state = sess.load(StateDTO.class, "Bihar");
        
		System.out.println(state.getLanguage());
		System.out.println(state.getNoOfDistricts());
	  
	 CMDTO cm = state.getCm();
	 
	    System.out.println(cm.getcmName());
	    System.out.println(cm.getParty());
	
	}

}
