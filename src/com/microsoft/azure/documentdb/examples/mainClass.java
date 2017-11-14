package com.microsoft.azure.documentdb.examples;

import com.microsoft.azure.documentdb.DocumentClientException;

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentCrudSamples objDocumentCrudSamples= new DocumentCrudSamples();
		try {
			objDocumentCrudSamples.createStoredDefinition();
			
		
		} catch (DocumentClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
