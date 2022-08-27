package com.example.demo;
import java.time.LocalTime;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("con")
public class MyControl {
	
	@Autowired
	private HttpServletRequest request;
	
	public HttpServletRequest getRequest() {   return request;	}

	public void setRequest(HttpServletRequest request) {	this.request = request;          }
	
	@Autowired
	private TaxiService ts;

	public TaxiService getTs() {	return ts;	}	public void setTs(TaxiService ts) {	this.ts = ts; }

	@RequestMapping("welcome")
	public String success() {
		
	LocalTime lt=LocalTime.now();  int lh=lt.getHour(),lm=lt.getMinute(),
			
	sh=Integer.parseInt(getRequest().getParameter("hour")),	sm=Integer.parseInt(getRequest().getParameter("min")),
	
	a=request.getParameter("ep").charAt(0),b=request.getParameter("sp").charAt(0),tothour=(Math.max(a, b)-Math.min(a, b));
		
		if(getRequest().getParameter("ep").equals(getRequest().getParameter("sp")) || tothour>5 ||  sh>23 || sm>59
			||	(lh>sh) || ((lh==sh)&&(lm>=sm)) ) {
			
			return "index";  }else {  int totmin=tothour*60,totamt=(((tothour*15)-5)*10)+100;  
			
			int endtime=(tothour+sh)%24;	System.out.println(totamt+":"+totmin+":"+endtime);	
			
			String tname=ts.taxiname(request.getParameter("sp")); 
			
			if(tname==null) { return "relog"; }else { 
				
				int tstation=ts.findTaxiStation(tname).charAt(0);
			
			int delay=(Math.max(tstation, b)-Math.min(tstation, b));  lt=lt.plusHours(delay); int lhh=lt.getHour();
			
			if((lhh>sh) || ((lhh==sh)&&(lm>=sm))) {  getRequest().setAttribute("ttime", delay); return "taxidelay"; }else {
			
			getRequest().setAttribute("tname", tname); 
			
			getTs().updateflag(tname, 1,totamt,request.getParameter("ep")); return "welcome";  }  }   } }

}
