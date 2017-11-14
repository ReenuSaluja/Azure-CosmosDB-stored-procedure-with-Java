



package com.microsoft.azure.documentdb.examples;



import org.junit.Test;

import com.microsoft.azure.documentdb.DocumentClient;
import com.microsoft.azure.documentdb.DocumentClientException;
import com.microsoft.azure.documentdb.PartitionKey;
import com.microsoft.azure.documentdb.RequestOptions;
import com.microsoft.azure.documentdb.StoredProcedureResponse;





public class DocumentCrudSamples

{

     private final String partitionKeyFieldName = "--Name of partition Key-----";

   




@Test

    public void createStoredDefinition() throws DocumentClientException {

    	DocumentClient client = new DocumentClient(AccountCredentials.HOST, AccountCredentials.MASTER_KEY, null, null);

        
        
        try
        {
        RequestOptions options = new RequestOptions();

            options.setPartitionKey(new PartitionKey(partitionKeyFieldName));
        	StoredProcedureResponse abc =  client.executeStoredProcedure("----value of _self from properties of your stored procedure--------------", options,null);
            System.out.println(abc.getResponseAsString());
        
        System.out.println("Function executed");
        }
        catch(Exception e)
        {
        e.printStackTrace();
        }


    }




}