package com.chlee4.lc;

import com.chlee1.collector.CSVMetadataCollector;
import com.chlee1.collector.PDFMetadataCollector;
import com.chlee3.fetch.FetchType;

public class Program {

	public static void main(String[] args) {
				
		CSVMetadataCollector csv_metacol = new CSVMetadataCollector(FetchType.XML_FETCH);
		PDFMetadataCollector pdf_metacol = new PDFMetadataCollector(FetchType.JSON_FETCH);
		
		csv_metacol.print();
		pdf_metacol.print();

	}

}
