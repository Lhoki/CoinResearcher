package com.thedailyshill.coinresearchhelper.services.tickerservices.returnresultsbyfield;

import org.json.JSONArray;
import org.json.JSONObject;

import com.thedailyshill.coinresearchhelper.services.JsonPrettier;
import com.thedailyshill.coinresearchhelper.services.tickerservices.TickerRequest;

public class ReturnByMarketCap {
	
	protected TickerRequest tr = new TickerRequest();
	protected JsonPrettier jp = new JsonPrettier();
	protected Long availableSupply;
	protected Long volumeBy24Hour;
	protected Long marketCap;
	

	public JSONArray ReturnByMarketCapRange(Long minMarketCap, Long maxMarketCap) throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("market_cap_usd")) {
				jsonObject.put("market_cap_usd", "0.0");
			}

			marketCap = Long.parseLong(((String) jsonObject.get("market_cap_usd")).replace(".0", ""));
			if ((marketCap > minMarketCap) && (marketCap < maxMarketCap)) {
				results.put(jsonObject);
			}

		}
		return results;
	}
	

}
