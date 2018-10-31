package com.ict.erp;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.MalformedURLException;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class PaPaGoTest {
	private String clientId ="ICJVjXSY1YeWhSTWdC_k";
	private String clientSecret ="aHLPiCZK_s";
	
	@Test
	public void test() {
		HttpURLConnection huc = null;
		BufferedReader br = null;
		String text= "hello";
		try {
			URL url = new URL("https://openapi.naver.com/v1/papago/n2mt");
			huc = (HTTPURLConnection)url.openConnection();
			huc.setRequestMethod("POST");
			huc.setRequestProperty("X-Naver-Client-Id", "");
			huc.setRequestProperty("X-Naver-Client-Secret", "");
			String param "source=en&target=ko&text=" + text;
			
			huc.setDoOutput(true);
			DataOutputStream dos = new DataOutputStream(huc.getOutputStream());
			dos.writeByte(param);
			dos.flush();
			dos.close();
			
			int status = huc.getResponseCode();
			
			if(status==200) {
				br= BufferedReader(new InputStreamReader(huc.getInputStream());
			}
			String result;
			StringBuffer sb = new StringBufferd();
			while((result=br.readLine()))!=null) {
					sb.append(result);
			}
				br.close();
				System.out.println(sb.toString());
		}catch(MalformedURLException e) {
			e.printlnStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

