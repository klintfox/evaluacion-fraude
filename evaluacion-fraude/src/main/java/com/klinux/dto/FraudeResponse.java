package com.klinux.dto;

import java.io.Serializable;

public class FraudeResponse implements Serializable {

	private static final long serialVersionUID = -3602790210316764323L;
	private String message;
	private String countryName;
	private String isoName;
	private String currencyName;
	private String currencyValueUS;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getIsoName() {
		return isoName;
	}

	public void setIsoName(String isoName) {
		this.isoName = isoName;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCurrencyValueUS() {
		return currencyValueUS;
	}

	public void setCurrencyValueUS(String currencyValueUS) {
		this.currencyValueUS = currencyValueUS;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}