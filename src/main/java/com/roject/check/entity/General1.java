package com.roject.check.entity;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class General1 implements TaxValidator 
	{
	 @Pattern(regexp = "[A-Z]{3}[P]{1}[A-Z]{1}[\\d]{4}[A-Z]{1}",message="Invalid value for Person Pan Number")//first five char 4numbers and last 1 char
	 private String personPanNum;
	 
	 @Pattern(regexp="[A-Z]{3}[C]{1}[A-Z]{1}[\\d]{4}[A-Z]{1}",message="Invalid value for Company Pan Number")
     private String companyPanNum;
	
	 @Pattern(regexp = "^([L|U]{1})([\\d]{5})([A-Za-z]{2})([\\d]{4})([A-Za-z]{3})([\\d]{6})$",message="Invalid value for CIN Number")
	  private String cIN;
	
	 @Pattern(regexp = "[\\d]{8}",message="Invalid value for DIN Number")
	 private String dIN;
	
	 @Size(max = 50,message="Invalid value for Street name")
	private String street;
	
	@Size(max=125,message="Invalid value for name")
	private String name;
	
	 @Pattern(regexp = "[0-9]{1,2}(/)[0-9]{1,2}(/)[0-9]{4}",message="Invalid value for date")
	private String date ;
	
	@Size(max = 50,message="Invalid value for city")
	private String city ;
	
    @Pattern(regexp="[1-9]{1}[\\d]{5}",message="Invalid value for Pincode")//Should be 6 digits and not start with 0
    private String pinCode;
	
    @Pattern(regexp="[A-Za-z0-9_.]+[@][a-z]+[.][a-z]{2,3}",message="Invalid value for email id")
    private String emailId;
	
    @Pattern(regexp = "[0-9]{6}",message="Invalid value for membership number of auditor")
	private String mem_no_auditor  ;
	 
	@Pattern(regexp ="[\\w]{8}", message="Invalid value for firm registration Number" )
	private String firm_reg_no ;
    
	private String dpiit;
    
    @Size(min=2,message="Invalid value for std code")
    private String std_code ;
	
    
	private String phno ;
    
	 @Pattern(regexp="[\\d\\D]{0,12}",message="Invalid value for SEBI Registration Number")
	 private String sebiRegNumber;
     
	 @Pattern(regexp = "[\\d]{10}",message="Invalid value for mobile number")
	 private String mobile;
	
	 //getters and setters
	  
		public String getSebiRegNumber() {
			return sebiRegNumber;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public void setSebiRegNumber(String sebiRegNumber) {
			this.sebiRegNumber = sebiRegNumber;
		}
		
		public String getPersonPanNum() {
			return personPanNum;
		}
		public void setPersonPanNum(String personPanNum) {
			this.personPanNum = personPanNum;
		}
		public String getCompanyPanNum() {
			return companyPanNum;
		}
		public void setCompanyPanNum(String companyPanNum) {
			this.companyPanNum = companyPanNum;
		}
		public String getcIN() {
			return cIN;
		}
		public void setcIN(String cIN) {
			this.cIN = cIN;
		}
		public String getdIN() {
			return dIN;
		}
		public void setdIN(String dIN) {
			this.dIN = dIN;
		}
		public String getStreet() {
			return street;
		}
		public void setStreet(String street) {
			this.street = street;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDate() {
			return date;
		}
		public void setDate( String date) {
			this.date = date;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getPinCode() {
			return pinCode;
		}
		public void setPinCode(String pinCode) {
			this.pinCode = pinCode;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getMem_no_auditor() {
			return mem_no_auditor;
		}
		public void setMem_no_auditor(String mem_no_auditor) {
			this.mem_no_auditor = mem_no_auditor;
		}
		public String getFirm_reg_no() {
			return firm_reg_no;
		}
		public void setFirm_reg_no(String firm_reg_no) {
			this.firm_reg_no = firm_reg_no;
		}
		public String getDpiit() {
			return dpiit;
		}
		public void setDpiit(String dpiit) {
			this.dpiit = dpiit;
		}
		public  String getStd_code() {
			return std_code;
		}
		public void setStd_code(String std_code) {
			this.std_code = std_code;
		}
		public String getPhno() {
			return phno;
		}
		public void setPhno(String phno) {
			this.phno = phno;
		}

//		Constructor 
		
		public General1()
		{
			super();
		}

	@Override
	public String taxReturnValidation(File f) 
	{
		try
		{
	  FileReader reader = new FileReader(f);
	  Properties p = new Properties();
	  p.load(reader);
	  System.out.println("\n Reading the file path ::"+f.getAbsolutePath());

	  this.setCompanyPanNum(p.getProperty("companyPanNum"));
	  this.setcIN(p.getProperty("cIN"));
	  this.setMobile(p.getProperty("mobile"));
	  this.setCity(p.getProperty("city"));
	  this.setDate(p.getProperty("date"));
	  this.setdIN(p.getProperty("dIN"));
	  this.setDpiit(p.getProperty("dpiit"));
	  this.setEmailId(p.getProperty("emailId"));
	  this.setFirm_reg_no(p.getProperty("firm_reg_no"));
	  this.setMem_no_auditor(mem_no_auditor);
	  this.setPersonPanNum(p.getProperty("personPanNum"));
	  this.setPhno(p.getProperty("phno"));
	  this.setPinCode(p.getProperty("pinCode"));
	  this.setStd_code(p.getProperty("std_code"));
	  this.setStreet(p.getProperty("street"));
	  this.setSebiRegNumber(p.getProperty("sebiRegNumber"));
	  this.setPersonPanNum(p.getProperty("name"));
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
			return null;	
		}

	}