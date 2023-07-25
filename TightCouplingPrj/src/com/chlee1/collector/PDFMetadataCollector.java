package com.chlee1.collector;

import java.util.List;

import com.chlee2.export.PDFExport;
import com.chlee3.fetch.FetchType;
import com.chlee3.fetch.JSONFetch;
import com.chlee3.fetch.XMLFetch;

public class PDFMetadataCollector {
	private FetchType inputType;
	    
    private XMLFetch xmlFetch;
    private JSONFetch jsonFetch;
    private PDFExport pdfExport;
    
    public PDFMetadataCollector(FetchType inputType) {
    	List<Object> metadata = null;
    	
    	this.inputType = inputType;
    	
    	if (inputType == FetchType.XML_FETCH) {
    		xmlFetch = new XMLFetch();
            metadata = xmlFetch.fetchMetadata();
        } else {
        	jsonFetch = new JSONFetch();
            metadata = jsonFetch.fetchMetadata();
        }
    	
    	pdfExport = new PDFExport();
        pdfExport.export(metadata);    	
    	
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
    	System.out.println("PDF Exporting data to" + inputTypeString);
    	
    }

}
