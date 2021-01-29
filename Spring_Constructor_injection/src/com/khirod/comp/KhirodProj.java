package com.khirod.comp;

public class KhirodProj {
	
	private String sname;
	
	private int sno;
	
	private String sadd;
	
	private String sjob;
	
	private String ssal;

	public KhirodProj(String sname, int sno, String sadd, String sjob, String ssal) {
		
		this.sname = sname;
		this.sno = sno;
		this.sadd = sadd;
		this.sjob = sjob;
		this.ssal = ssal;
	}

	@Override
	public String toString() {
		return "KhirodProj [sname=" + sname + ", sno=" + sno + ", sadd=" + sadd + ", sjob=" + sjob + ", ssal=" + ssal
				+ "]";
	}
	
	

}
