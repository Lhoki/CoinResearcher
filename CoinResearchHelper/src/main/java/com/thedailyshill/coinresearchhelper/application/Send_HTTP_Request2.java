/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thedailyshill.coinresearchhelper.application;

<<<<<<< HEAD

import com.thedailyshill.coinresearchhelper.services.tickerservices.ReturnSingleData;
=======
import com.thedailyshill.coinresearchhelper.services.tickerservices.MarketCapRequest;
>>>>>>> d3dce49789b80592f61a43ea643ed495c63de687
import com.thedailyshill.coinresearchhelper.services.tickerservices.TickerRequest;

public class Send_HTTP_Request2 {
	public static void main(String[] args) throws Exception {
		
		TickerRequest tr = new TickerRequest();
		MarketCapRequest mkr = new MarketCapRequest();
		
<<<<<<< HEAD
		ReturnSingleData rsd = new ReturnSingleData();		
		System.out.println(rsd.returnSingleData("max_supply", "bitcoin"));

=======
		System.out.println(mkr.returnMarketCap("payfair"));
		System.out.print(tr.returnTickerRequest("payfair"));
//		try {
//			Send_HTTP_Request2.call_me();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
>>>>>>> d3dce49789b80592f61a43ea643ed495c63de687
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
