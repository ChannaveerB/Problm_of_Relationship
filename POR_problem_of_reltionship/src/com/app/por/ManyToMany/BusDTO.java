package com.app.por.ManyToMany;

import java.io.Serializable;
import java.util.Collection;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity
@Table(name="bus_table")
public class BusDTO implements Serializable{
	
	@Id
    @GenericGenerator(name="gen",strategy="increment")
	@GeneratedValue(generator="gen")
	@Column(name="sl_no")
	private int slNO;
	
	@Column(name="bus_number")
	private String number;
	
	public Collection<PassengerDTO> getPassengers() {
		return passengers;
	}
	public void setPassengers(Collection<PassengerDTO> passengers) {
		this.passengers = passengers;
	}
	@Column(name="bus_color")
	private String color;
	
	public int getNoOfseats() {
		return noOfseats;
	}
	public void setNoOfseats(int noOfseats) {
		this.noOfseats = noOfseats;
	}
	@Column(name="bus_destination")
	private String Destination;
	
	@Column(name="noOf_seats")
	private int noOfseats;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private Collection<PassengerDTO> passengers;
	
	public int getSlNO() {
		return slNO;
	}
	public void setSlNO(int slNO) {
		this.slNO = slNO;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	
	
}
