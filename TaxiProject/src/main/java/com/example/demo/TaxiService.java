package com.example.demo;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxiService {
	
	@Autowired
	private TaxiDAO taxi;

	public TaxiDAO getTaxi(){	return taxi; }	public void setTaxi(TaxiDAO taxi) {	this.taxi = taxi;	}
	
	public void updateflag(String tname,int a,int b,String sta) {
		
		List<Taxipro> li=getTaxi().findByTname(tname);  Iterator<Taxipro> it=li.iterator();	Taxipro tp=it.next();
			
			tp.setFlag(a); int amt=tp.getTamt()+b; tp.setStation(sta); tp.setTamt(amt); getTaxi().save(tp);	}
	
	public String findTaxiStation(String tname) {
		
		List<Taxipro> li=taxi.findByTname(tname);  Iterator<Taxipro> it=li.iterator();  while(it.hasNext()) {
		
    	Taxipro tp=it.next();  return tp.getStation();  	}  return null;}
	
	public String taxiname(String station) {
		
		String tname=taxinames(station);  if(tname==null) {
		
		char c=station.charAt(0); int d=c; String e=String.valueOf((char)(d+1)),f=String.valueOf((char)(d-1));
		
		String tname1=taxinames(f);  if(tname1==null) { return taxinames(e); }else {
		
		return tname1; }	}else {	return tname; }  }
	
	public String taxinames(String station) {
		
		List<Taxipro> li=taxi.selectTaxi(station);  Iterator<Taxipro> it=li.iterator();  while(it.hasNext()) {
			
			Taxipro tp=it.next();  return tp.getTname();  	}	return null;  }}
