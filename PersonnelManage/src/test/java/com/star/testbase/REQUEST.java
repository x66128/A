package com.star.testbase;

public class REQUEST {

	private HRT_ATTRS hrt;
	private REQUEST_DATA requestdata;
	
	public HRT_ATTRS getHrt() {
		return hrt;
	}
	public void setHrt(HRT_ATTRS hrt) {
		this.hrt = hrt;
	}
	public REQUEST_DATA getRequestdata() {
		return requestdata;
	}
	public void setRequestdata(REQUEST_DATA requestdata) {
		this.requestdata = requestdata;
	}
	@Override
	public String toString() {
		return "REQUEST [hrt=" + hrt + ", requestdata=" + requestdata + "]";
	}
	

}

