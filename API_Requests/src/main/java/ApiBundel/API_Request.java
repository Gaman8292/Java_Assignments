package ApiBundel;

import java.io.IOException;
import java.util.Base64;

import okhttp3.*;


public class API_Request 
{
	private final OkHttpClient client = new OkHttpClient();

    public Response sendRequest(String requestMethod, String urlString, String body, String username, String password) throws IOException 
    {
        String credentials = username + ":" + password;
        final String basic = "Basic " + Base64.getEncoder().encodeToString(credentials.getBytes());

        RequestBody requestBody = body != null ? RequestBody.create(body, MediaType.parse("application/json; charset=utf-8")) : null;
        Request request = new Request.Builder().url(urlString).header("Authorization", basic).method(requestMethod, requestBody).build();

        try (Response response = client.newCall(request).execute()) 
        {
            if (!response.isSuccessful()) 
            { throw new IOException("Unexpected code " + response); }
            else 
            { 
            	System.out.println("Response :"+ response);
            	System.out.println("Response Code :"+ response.code()); 
            }
            return response;
        }
    }

    public Response get(String urlString, String username, String password) throws IOException 
    { return sendRequest("GET", urlString, null, username, password);  }

    public Response post(String urlString, String body, String username, String password) throws IOException 
    { return sendRequest("POST", urlString, body, username, password); }

    public Response put(String urlString, String body, String username, String password) throws IOException 
    { return sendRequest("PUT", urlString, body, username, password); }

    public Response delete(String urlString, String username, String password) throws IOException 
    { return sendRequest("DELETE", urlString, null, username, password); }
}
