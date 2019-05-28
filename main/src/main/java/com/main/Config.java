package com.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

import https.www_w3schools_com.xml.TempConvert;
@Configuration
public class Config {
	@Bean
	public TempConvert getTempConvert() {
		return new TempConvert();
	}
	@Bean
	public GeoIPServiceSoap  getGeoIPServiceSoap () {
		return new GeoIPService().getGeoIPServiceSoap();
	}

}
