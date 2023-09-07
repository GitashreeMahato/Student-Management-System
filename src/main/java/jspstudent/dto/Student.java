package jspstudent.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Student {
	
	@Id
	private int sid;
	private String stuname;
	private String stuemail;
	private String stupassword;
	private long stuphoneno;
	private String stuaddress;
	private double stufees;
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStuemail() {
		return stuemail;
	}
	public void setStuemail(String stuemail) {
		this.stuemail = stuemail;
	}
	public String getStupassword() {
		return stupassword;
	}
	public void setStupassword(String stupassword) {
		this.stupassword = stupassword;
	}
	public long getStuphoneno() {
		return stuphoneno;
	}
	public void setStuphoneno(long stuphoneno) {
		this.stuphoneno = stuphoneno;
	}
	public String getStuaddress() {
		return stuaddress;
	}
	public void setStuaddress(String stuaddress) {
		this.stuaddress = stuaddress;
	}
	public double getStufees() {
		return stufees;
	}
	public void setStufees(double stufees) {
		this.stufees = stufees;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", stuname=" + stuname + ", stuemail=" + stuemail + ", stupassword="
				+ stupassword + ", stuphoneno=" + stuphoneno + ", stuaddress=" + stuaddress + ", stufees=" + stufees
				+ "]";
	}
	
	

}
