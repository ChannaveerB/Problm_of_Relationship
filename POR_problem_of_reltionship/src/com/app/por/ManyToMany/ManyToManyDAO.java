package com.app.por.ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.singleton.SingleTonUtil;

public class ManyToManyDAO {

	public static void main(String[] args) {
		
		
		//create multiple bus objects
		BusDTO bus1 = new BusDTO();
		bus1.setColor("Blue");
		bus1.setNumber("45G");
        bus1.setDestination("KBS");
        bus1.setNoOfseats(52);
        
        BusDTO bus2 = new BusDTO();
		bus2.setColor("green");
		bus2.setNumber("60A");
        bus2.setDestination("jayanagar");
        bus2.setNoOfseats(46);
        
      //create muyltiple objects of passengers
       PassengerDTO pssgr1 = new PassengerDTO();
        pssgr1.setType("senior");
        pssgr1.setTicketNo(1234);
        
        PassengerDTO pssgr2 = new PassengerDTO();
        pssgr2.setType("Adult");
        pssgr2.setTicketNo(7777);
        
        //create a collection of passengers
        List<PassengerDTO> passengers=new ArrayList<>();
        passengers.add(pssgr1);
        passengers.add(pssgr2);
        
        //relate 45G with 2 passengers
        bus1.setPassengers(passengers);
        
        //relate 60A with 2 passengers
        bus2.setPassengers(passengers);
        
        //create the collection of buses
        List<BusDTO> buses = new ArrayList<>();
        buses.add(bus1);
        buses.add(bus2);
        
        //relate each passenger with collection of Buses
        pssgr1.setBuses(buses);
        pssgr2.setBuses(buses);
        
        SessionFactory sf = SingleTonUtil.getSF();
        Session sess = sf.openSession();
        
        sess.save(bus2);
        sess.save(bus1);
        
        sess.save(pssgr1);
        sess.save(pssgr2);
        
        sess.beginTransaction().commit();
	}

}
