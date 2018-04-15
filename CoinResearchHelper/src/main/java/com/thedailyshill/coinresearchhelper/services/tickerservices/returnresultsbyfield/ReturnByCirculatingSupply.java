package com.thedailyshill.coinresearchhelper.services.tickerservices.returnresultsbyfield;

import org.json.JSONArray;
import org.json.JSONObject;

import com.thedailyshill.coinresearchhelper.services.JsonPrettier;
import com.thedailyshill.coinresearchhelper.services.tickerservices.TickerRequest;

public class ReturnByCirculatingSupply {

	protected TickerRequest tr = new TickerRequest();
	protected JsonPrettier jp = new JsonPrettier();
	protected Long availableSupply;
	protected Long volumeBy24Hour;
	protected Double coinPrice;
	

	public JSONArray ReturnByMinCirculatingSupply(Long minCirculatingSupply) throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("available_supply")) {
				jsonObject.put("available_supply", "0.0");
			}

			availableSupply = Long.parseLong(((String) jsonObject.get("available_supply")).replace(".0", ""));
			if (availableSupply > minCirculatingSupply && availableSupply >= 1) {
				results.put(jsonObject);
			}

		}
		return results;
	}
	
	public JSONArray ReturnByMaxCirculatingSupply(Long maxCirculatingSupply) throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("available_supply")) {
				jsonObject.put("available_supply", "0.0");
			}

			availableSupply = Long.parseLong(((String) jsonObject.get("available_supply")).replace(".0", ""));
			if (availableSupply < maxCirculatingSupply && availableSupply >= 1) {
				results.put(jsonObject);
			}

		}
		return results;
	}
	
	
	public JSONArray ReturnByCirculatingSupplyRange(Long minCirculatingSupply, Long maxCirculatingSupply) throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("available_supply")) {
				jsonObject.put("available_supply", "0.0");
			}

			availableSupply = Long.parseLong(((String) jsonObject.get("available_supply")).replace(".0", ""));
			if (availableSupply >= minCirculatingSupply && availableSupply <= maxCirculatingSupply) {
				results.put(jsonObject);
			}

		}
		return results;
	}
	
}
