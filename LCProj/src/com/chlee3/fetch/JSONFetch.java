package com.chlee3.fetch;

import java.util.ArrayList;
import java.util.List;

public class JSONFetch implements FetchMetadata {
	
	final String fetchType = "JSON";	
	private static JSONFetch instance = null;
	
	private JSONFetch() {
    }
    
    
    public static JSONFetch getInstance() {
        
        if (instance == null) {
            instance = new JSONFetch();
        }
        return instance;
    }
	
	@Override
	public String getFetchType() {		
		return this.fetchType;
	}

	@Override
	public List<Object> fetchMetadata() {
		List<Object> metadata = new ArrayList<>();
		System.out.println("J야호얄루얄루 수정수정~!");
        return metadata;
	}
}