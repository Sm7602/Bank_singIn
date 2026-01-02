package com.spring.mvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "acHolder")
public class AcHolder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String dob;
	private String gender;
	private String acno;
	private String acType;
	private String IFSC_code;
	private String phno;
	private String address;
	
	public AcHolder() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public AcHolder(String name, String dob, String gender, String acno, String acType, String iFSC_code, String phno,
			String address) {
		super();
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.acno = acno;
		this.acType = acType;
		this.IFSC_code = iFSC_code;
		this.phno = phno;
		this.address = address;
	}



	public String getPhno() {
		return phno;
	}



	public void setPhno(String phno) {
		this.phno = phno;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAcno() {
		return acno;
	}

	public void setAcno(String acno) {
		this.acno = acno;
	}

	public String getAcType() {
		return acType;
	}

	public void setAcType(String acType) {
		this.acType = acType;
	}

	public String getIFSC_code() {
		return IFSC_code;
	}

	public void setIFSC_code(String iFSC_code) {
		IFSC_code = iFSC_code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "AcHolder [id=" + id + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", acno=" + acno
				+ ", acType=" + acType + ", IFSC_code=" + IFSC_code + ", phno=" + phno + ", address=" + address + "]";
	}

	

}
