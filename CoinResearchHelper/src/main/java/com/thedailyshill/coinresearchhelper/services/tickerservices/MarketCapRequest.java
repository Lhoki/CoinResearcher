package com.thedailyshill.coinresearchhelper.services.tickerservices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class MarketCapRequest extends TickerRequest {
	
	public String returnMarketCap(String cryptoName) throws Exception {
		URL obj = new URL(defaultUrl+cryptoName);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		
		in.close();
		JSONObject myResponse = new JSONObject(response.toString().replace("[", "").replace("]", ""));
		return myResponse.getString("market_cap_usd");
		
		
		
		
	}
	
}
