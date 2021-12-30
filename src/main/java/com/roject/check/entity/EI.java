package com.roject.check.entity;



import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class EI implements TaxValidator
	{	
	 
	@Pattern(regexp="[\\d]{1,14}", message="Invalid value for amount") //Numeric value only non negative, no decimal upto 14 digit
	private String amount;

	@Pattern(regexp="[a-zA-Z ]{1,125}", message="Invalid value for district") //Only characters  upto 125 limit
	private String districtname;
	
	@Pattern(regexp="[1-9]{1}[0-9]{5}|[1-9]{1}[0-9]{3}[0-9]{3}", message="Invalid value for pincode") //Should be 6 digit and start with zero
	private String pincode;
	
	@Pattern(regexp="[\\d]{1,14}",message="Invalid value for land measure") //Numeric value only non negative, no decimal upto 14 digit
	private String landmeasure;
	
	@Pattern(regexp="[\\d]{1,14}", message="Invalid value for chargable data") //Numeric value only non negative, no decimal upto 14 digit
	private String chargabledtaa;

	
	public EI() 
	{
		super();
	}
	
//    getters and setters
	
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDistrictname() {
		return districtname;
	}

	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getLandmeasure() {
		return landmeasure;
	}

	public void setLandmeasure(String landmeasure) {
		this.landmeasure = landmeasure;
	}

	public String getChargabledtaa() {
		return chargabledtaa;
	}

	public void setChargabledtaa(String chargabledtaa){
		this.chargabledtaa = chargabledtaa;
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

		  this.setAmount(p.getProperty("amount"));
		  this.setDistrictname(p.getProperty("districtname"));
		  this.setPincode(p.getProperty("pincode"));
		  this.setLandmeasure(p.getProperty("landmeasure"));
		  this.setChargabledtaa(p.getProperty("chargabledtaa"));
	} 
	catch (Exception e)
	 {
		e.printStackTrace();
	 }
		return null;	
		
	}
	}
