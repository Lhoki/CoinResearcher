package com.thedailyshill.coinresearchhelper.services.tickerservices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;

import com.thedailyshill.coinresearchhelper.services.JsonPrettier;

public class TickerRequest {
	
	String defaultUrl = "https://api.coinmarketcap.com/v1/ticker/";
	String inputLine;
	StringBuffer response = new StringBuffer();


	public String returnTickerRequest() throws Exception {
		
		URL obj = new URL(defaultUrl);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}

		in.close();
		JSONArray myResponse = new JSONArray(response.toString());
		return new JsonPrettier().prettyFy(myResponse);

	}
	
	public String returnTickerRequest(String cryptoName) throws Exception {
		
		URL obj = new URL(defaultUrl+cryptoName);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}

		in.close();
		JSONArray myResponse = new JSONArray(response.toString());
		return new JsonPrettier().prettyFy(myResponse);

	}

}