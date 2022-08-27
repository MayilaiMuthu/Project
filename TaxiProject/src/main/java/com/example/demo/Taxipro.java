package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Taxipro {
	
	@Id                     
	private int sno;	private int flag,tamt;	private String station,tname;

	public int getSno() {	return sno;	}

	public void setSno(int sno) {	this.sno = sno;	}

	public int getFlag() {	return flag;	}

	public void setFlag(int flag) {	this.flag = flag;	}

	public int getTamt() {	return tamt;	}

	public void setTamt(int tamt) {	this.tamt = tamt;	}

	public String getStation() {		return station;	}

	public void setStation(String station) {		this.station = station;	}

	public String getTname() {		return tname;	}

	public void setTname(String tname) {		this.tname = tname;	}

}
