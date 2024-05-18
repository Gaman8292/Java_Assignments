package API_Test_Bundel;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import org.testng.Assert;
import org.testng.annotations.Test;

import ApiBundel.API_Request;
import okhttp3.Response;

public class Test_ApiRequest
{

	API_Request apiRequest = new API_Request();
	String username = "";
    String password = "";
    
    File projectDirectory = new File(System.getProperty("user.dir"));
	String FilesFolderPath = projectDirectory.getParent();
        
    @Test
    public void testGet() 
    {
        String url = "https://www.google.com/";
        int expectedResponseCode = 200;
        
        try 
        {
        	Response response = apiRequest.get(url, username, password);
        	Assert.assertEquals(response.code(), expectedResponseCode, "The response code is as expected.");
        	try (PrintWriter out = new PrintWriter(FilesFolderPath + "/Files/GoogleResponse.txt")) 
        	{ out.println(response); }
        } 
        catch (IOException e) 
        {
            Assert.fail("The response code is not as expected.", e);
        }
    }
}