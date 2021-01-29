package com.khirod.comp;

import java.util.Date;

public class WishMessageGenerator {
	
	private Date date;
	


	
	
	public Date getDate() {
		return date;
	}





	public void setDate(Date date) {
		this.date = date;
	}





	public String generateWishMessage(String user) {
		
		int hour=0;
		
		hour=date.getHours();
		
		if(hour<12)
			return("GoodMorning"+" "+user);
		else if(hour<17)
			return("GoodafterNoon"+"  "+user);
		else if(hour<23)
			return("GoodEvening"+" "+user);
		else
			return("GoodNight"+" "+user);
	}






	
}
