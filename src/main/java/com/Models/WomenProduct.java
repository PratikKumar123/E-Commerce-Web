package com.Models;

public class WomenProduct {

	private String wname;
	private String wdec;
	private int wprice;
	private String wurl;
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public String getWdec() {
		return wdec;
	}
	public void setWdec(String wdec) {
		this.wdec = wdec;
	}
	public int getWprice() {
		return wprice;
	}
	public void setWprice(int wprice) {
		this.wprice = wprice;
	}
	public String getWurl() {
		return wurl;
	}
	public void setWurl(String wurl) {
		this.wurl = wurl;
	}
	@Override
	public String toString() {
		return "WomenProduct [wname=" + wname + ", wdec=" + wdec + ", wprice=" + wprice + ", wurl=" + wurl + "]";
	}

	
}
