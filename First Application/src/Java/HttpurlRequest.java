package Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpurlRequest {
	public void getmethodexample() throws IOException {
		URL url=new URL("http://dummy.restapiexample.com/api/v1/employees");
		HttpURLConnection connection=(HttpURLConnection)url.openConnection();
		connection.setRequestMethod("GET");
		connection.connect();
		int statuscode=connection.getResponseCode();
		System.out.println(statuscode);
		String message=connection.getResponseMessage();
		System.out.println(message);
		InputStream inputstream=connection.getInputStream();
		InputStreamReader inputstreamreader=new InputStreamReader(inputstream);
		BufferedReader bufferedreader=new BufferedReader(inputstreamreader);
		String line;
		StringBuffer stringbuffer=new StringBuffer();
		while((line=bufferedreader.readLine())!=null) {
			stringbuffer.append(line);
			
		}
		System.out.println(stringbuffer);
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		HttpurlRequest request=new HttpurlRequest();
		request.getmethodexample();
	}

}
