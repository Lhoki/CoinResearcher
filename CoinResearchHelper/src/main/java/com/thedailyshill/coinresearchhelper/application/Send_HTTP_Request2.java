/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedailyshill.coinresearchhelper.application;

import com.thedailyshill.coinresearchhelper.services.tickerservices.DataRequest;

public class Send_HTTP_Request2 {
	public static void main(String[] args) throws Exception {
		System.out.println(new DataRequest().marketCap("bitcoin"));
		
//		ReturnSingleData rsd = new ReturnSingleData();		
//		System.out.println(rsd.returnSingleData("max_supply", "payfair"));

	}
	
	
	
	
	
	
//	public static void call_me() throws Exception {
//
//		String url = "https://api.coinmarketcap.com/v1/ticker/";
//		URL obj = new URL(url);
//		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
//		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
//		String inputLine;
//		StringBuffer response = new StringBuffer();
//		while ((inputLine = in.readLine()) != null) {
//			response.append(inputLine);
//		}
//		in.close();
//
//		JSONArray myResponse = new JSONArray(response.toString());
//		System.out.println(new JsonPrettier().prettyFy(myResponse));
//	}

}

// System.out.println("Name: " + myResponse.getString("name"));
// System.out.println("Symbol: " + myResponse.getString("symbol"));
// System.out.println("Rank: " + myResponse.getString("rank"));
// System.out.println("USD Price: " + myResponse.getString("price_usd"));
// System.out.println("BTC Price: " + myResponse.getString("price_btc"));
// System.out.println("24H Volume: " + myResponse.getString("24h_volume_usd"));
// System.out.println("USD Market Cap: " +
// myResponse.getString("market_cap_usd"));
// System.out.println("Current Supply: " +
// myResponse.getString("available_supply"));
// if (!(myResponse.isNull("max_supply"))){
// System.out.println("Max Supply: " + myResponse.getString("max_supply"));
// }
// System.out.println("1 Hour Change: " +
// myResponse.getString("percent_change_1h") + "%");
// System.out.println("24 Hour Change: " +
// myResponse.getString("percent_change_24h") + "%");
// System.out.println("7 Day Change: " +
// myResponse.getString("percent_change_7d") + "%");
//
