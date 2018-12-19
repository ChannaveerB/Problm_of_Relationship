package com.app.por.OnetoOne;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="state_table")
public class StateDTO implements Serializable {
	
	@Id
	@Column(name="state_name")
	private String nameOfState;
	@Column(name="state_language")
	private String language;
	@Column(name="noOf_Districts")
	private int noOfDistricts;
	
	//reference of CM
	@OneToOne(cascade=CascadeType.ALL)
	private CMDTO cm;
	
	public String getNameOfState() {
		return nameOfState;
	}
	public void setNameOfState(String nameOfState) {
		this.nameOfState = nameOfState;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getNoOfDistricts() {
		return noOfDistricts;
	}
	public void setNoOfDistricts(int noOfDistricts) {
		this.noOfDistricts = noOfDistricts;
	}
	public CMDTO getCm() {
		return cm;
	}
	public void setCm(CMDTO cm) {
		this.cm = cm;
	}
	 

}
