package com.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import com.lavasoft.GeoIPServiceSoap;

@Service
public class LocationService {
	@Autowired
	GeoIPServiceSoap gClient;
	
	@Autowired
	ConversionService cs;

	public String getLocation() {
		// TODO Auto-generated method stub
		return cs.convert(gClient.getLocation(),String.class);
	}

}
