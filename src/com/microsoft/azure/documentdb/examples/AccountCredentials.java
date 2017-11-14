package com.microsoft.azure.documentdb.examples;



/**

 * Contains the configurations for test file

 */

public final class AccountCredentials {

    // Replace MASTER_KEY and HOST with values from your DocumentDB account.

    // The default values are credentials of the local emulator, which are not used in any production environment.

    // <!--[SuppressMessage("Microsoft.Security", "CS002:SecretInNextLine")]-->

    public static final String MASTER_KEY =

            "----Insert value of master key here-------------";

    public static final String HOST = "https://<--name of your cosmosdb account------>.documents.azure.com:443/";

}