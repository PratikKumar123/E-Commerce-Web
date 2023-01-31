package com.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AddProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String productId;
	private String pname;
	private String pdec;
	private int pprice;
	private String purl;
	private String pgender;
	
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdec() {
		return pdec;
	}
	public void setPdec(String pdec) {
		this.pdec = pdec;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public String getPurl() {
		return purl;
	}
	public void setPurl(String purl) {
		this.purl = purl;
	}
	public String getPgender() {
		return pgender;
	}
	public void setPgender(String pgender) {
		this.pgender = pgender;
	}
	@Override
	public String toString() {
		return "AddProduct [id=" + id + ", pname=" + pname + ", pdec=" + pdec + ", pprice=" + pprice + ", purl=" + purl
				+ ", pgender=" + pgender + "]";
	}
	
	
	
	
}
