package com.app.por.OnetoMany;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="person_table")
public class PersonDTO implements Serializable{
	
	@Id
	@GenericGenerator(name="gen",strategy="increment")
    @GeneratedValue(generator="gen")
	@Column(name="mob_no")
	private long mobileNO;
	
	@Column(name="per_name")
	private String name;
	
	@Column(name="citizan")
	private String nationality;
	
	@Column(name="degree")
	private String qualification;
	
	@Column(name="bank_bal")
	private double bankbalence;
	
	@JoinColumn(name="prob")
	@OneToMany(cascade=CascadeType.ALL)
	private Collection<ProblemDTO> probs;

	
	@Override
	public String toString() {
		return "PersonDTO [bankbalence=" + bankbalence + ", mobileNO=" + mobileNO + ", name=" + name + ", nationality="
				+ nationality + ", probs=" + probs + ", qualification=" + qualification + "]";
	}
	public long getMobileNO() {
		return mobileNO;
	}
	public void setMobileNO(long mobileNO) {
		this.mobileNO = mobileNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public double getBankbalence() {
		return bankbalence;
	}
	public void setBankbalence(double bankbalence) {
		this.bankbalence = bankbalence;
	}
	public Collection<ProblemDTO> getProbs() {
		return probs;
	}

	public void setProbs(Collection<ProblemDTO> probs) {
		this.probs = probs;
	}
	
}
