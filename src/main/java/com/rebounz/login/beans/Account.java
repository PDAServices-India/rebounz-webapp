package com.rebounz.login.beans;

import java.io.Serializable;

public class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userid;

	private String username;

	private String firstname;

	private String lastname;
	
    private String email;
	
	private String country;
	
	private String state;
	
	private String zipCode; 
	
    private String cardName;
	
	private String cardNumber;
	
	private String payementMode; 
	
	private String payementType; 
	
	private String expireMonth; 
	
	private String expireYear;

	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}

	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the cardName
	 */
	public String getCardName() {
		return cardName;
	}

	/**
	 * @param cardName the cardName to set
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}


	/**
	 * @return the payementMode
	 */
	public String getPayementMode() {
		return payementMode;
	}

	/**
	 * @param payementMode the payementMode to set
	 */
	public void setPayementMode(String payementMode) {
		this.payementMode = payementMode;
	}

	/**
	 * @return the payementType
	 */
	public String getPayementType() {
		return payementType;
	}

	/**
	 * @param payementType the payementType to set
	 */
	public void setPayementType(String payementType) {
		this.payementType = payementType;
	}

	/**
	 * @return the expireMonth
	 */
	public String getExpireMonth() {
		return expireMonth;
	}

	/**
	 * @param expireMonth the expireMonth to set
	 */
	public void setExpireMonth(String expireMonth) {
		this.expireMonth = expireMonth;
	}

	/**
	 * @return the expireYear
	 */
	public String getExpireYear() {
		return expireYear;
	}

	/**
	 * @param expireYear the expireYear to set
	 */
	public void setExpireYear(String expireYear) {
		this.expireYear = expireYear;
	} 
	


}
