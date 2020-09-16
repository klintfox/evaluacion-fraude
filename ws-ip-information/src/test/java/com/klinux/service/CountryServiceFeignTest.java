package com.klinux.service;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.klinux.clients.BanIpClientRest;
import com.klinux.clients.ConversionClientRest;
import com.klinux.clients.CountryClientRest;
import com.klinux.clients.CurrencyClientRest;
import com.klinux.dto.CountryDto;

@RunWith(SpringRunner.class)
@SpringBootTest
class CountryServiceFeignTest {

	@Autowired
	private BanIpClientRest banIpClient;

	@Autowired
	private CountryClientRest countryClient;

	@Autowired
	private CurrencyClientRest currencyClient;

	@Autowired
	private ConversionClientRest conversionClient;

//	@Test
	@DisplayName("testValidateIpInBlackList")
	void testValidateIp() {
		String ip = "186.84.91.61";
		String estado = null;
		estado = banIpClient.getIpStatus(ip);
		assertTrue(estado.length() > 0);
	}

	@Test
	@DisplayName("testCountryDetail")
	void testGetCountryDetail() {
		String ip = "186.84.91.60";
		CountryDto country = countryClient.getCountryDetail(ip);
		assertTrue(country.toString().length() > 0);
	}

	@Test
	@DisplayName("testCurrencyByCountryName")
	void testGetCurrencyByCountryName() {
		String countryName = "Colombia";
		String jsonCurrency = currencyClient.getCurrencyByCountryName(countryName);
		assertTrue(jsonCurrency.length() > 0);
	}

	@Test
	@DisplayName("testCurrencyDetail")
	void testGetCurrencyDetail() {
		String currencyCode = "COP";
		String jsonConversion = conversionClient.getCurrencyDetail(currencyCode);
		assertTrue(jsonConversion.length() > 0);
	}

}