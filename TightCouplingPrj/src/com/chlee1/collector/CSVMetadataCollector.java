package com.chlee1.collector;

import java.util.List;

import com.chlee2.export.CSVExport;
import com.chlee3.fetch.FetchType;
import com.chlee3.fetch.JSONFetch;
import com.chlee3.fetch.XMLFetch;

public class CSVMetadataCollector {
	
	private FetchType inputType;
	    
    private XMLFetch xmlFetch;
    private JSONFetch jsonFetch;
    private CSVExport csvExport;
    
        
    public CSVMetadataCollector(FetchType inputType) {
    	List<Object> metadata = null;
    	
    	this.inputType = inputType;
    	
    	if (inputType == FetchType.XML_FETCH) {
    		xmlFetch = new XMLFetch();
            metadata = xmlFetch.fetchMetadata();
        } else {
        	jsonFetch = new JSONFetch();
            metadata = jsonFetch.fetchMetadata();
        }   	 	
    	                  
        csvExport = new CSVExport();
        csvExport.export(metadata);        
    }
    
    private FetchType getFetchType() {
    	return this.inputType;
    }
    
    public void print() {
    	String inputTypeString;
    	if (getFetchType() == FetchType.XML_FETCH) {
    		inputTypeString = "XML";
        } else {
        	inputTypeString = "JSON";
        } 
    	System.out.println("CSV Exporting data to" + inputTypeString);
    	
    }
	

}
