package com.app.por.OnetoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.singleton.SingleTonUtil;

public class TestRelationship {

	public static void main(String[] args) {
		
	//create object of state
	StateDTO state = new StateDTO();
	state.setNameOfState("Bihar");
	state.setLanguage("Bhojpuri");
	state.setNoOfDistricts(38);
	
	//create obj of CM
	CMDTO cm = new CMDTO();
	cm.setcmName("Nitesh kumar");
	cm.setParty("JDU");
	cm.setSalary(215000);
	cm.setPhNo(2100445577);
	
	//relate woner with associated obj
	state.setCm(cm);// small (cm) is object name/* this is from StateDTO public void setCm(CMDTO cm) {this.cm = cm;}
	cm.setState(state);// (state) is object name/* this is from StateDTO public void setState(StateDTO state) {his.state = state;
     
	SessionFactory sf = SingleTonUtil.getSF();
	Session sess = sf.openSession();
	sess.save(cm);
	sess.beginTransaction().commit();
	

	}

}
