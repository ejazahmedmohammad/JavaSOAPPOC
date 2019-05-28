package com.main;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.lavasoft.GetLocationResponse;
@Component
public class ResponseToStringConverter
  implements Converter<GetLocationResponse,String> {
 

    public String convert(GetLocationResponse from) {
		return from.getGetLocationResult();
        
    }

	
}