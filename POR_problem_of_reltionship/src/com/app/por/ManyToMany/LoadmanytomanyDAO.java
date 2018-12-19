package com.app.por.ManyToMany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.singleton.SingleTonUtil;

public class LoadmanytomanyDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = SingleTonUtil.getSF();
		Session sess = sf.openSession();
		

		/*
		 * //fetch bus fromDB BusDTO bus1=sess.load(BusDTO.class, 2);
		 * 
		 * System.out.println(bus1.getNumber());
		 * 
		 * 
		 * //obtain passensgers fro bus List<PassengerDTO>
		 * passengers=(List<PassengerDTO>)bus1.getPassengers(); for (PassengerDTO
		 * passengerDTO : passengers) { System.out.println(passengerDTO.getTicketNo());
		 * }
		 */

		// obtain passenger
		PassengerDTO pass = sess.load(PassengerDTO.class, 7777);
		System.out.println(pass.getType());

		// obtain buses from passenger

		List<BusDTO> buses = (List<BusDTO>) pass.getBuses();
		for (BusDTO busDTO : buses) {
			System.out.println(busDTO.getNumber());
		}

	}

}
