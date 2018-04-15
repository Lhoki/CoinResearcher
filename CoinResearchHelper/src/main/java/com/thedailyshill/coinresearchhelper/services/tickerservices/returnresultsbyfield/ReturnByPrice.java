package com.thedailyshill.coinresearchhelper.services.tickerservices.returnresultsbyfield;

import org.json.JSONArray;
import org.json.JSONObject;

import com.thedailyshill.coinresearchhelper.services.JsonPrettier;
import com.thedailyshill.coinresearchhelper.services.tickerservices.TickerRequest;

public class ReturnByPrice {

	protected TickerRequest tr = new TickerRequest();
	protected JsonPrettier jp = new JsonPrettier();
	protected Long availableSupply;
	protected Long volumeBy24Hour;
	protected Double coinPrice;
	

	public JSONArray ReturnByMinPrice(Double minPrice) throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("price_usd")) {
				jsonObject.put("price_usd", "0.0");
			}

			coinPrice = Double.parseDouble((String) (jsonObject.get("price_usd")));
			if (coinPrice >= minPrice) {
				results.put(jsonObject);
			}

		}
		return results;
	}

	public JSONArray ReturnByMaxPrice(Double maxPrice) throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("price_usd")) {
				jsonObject.put("price_usd", "0.0");
			}

			coinPrice = Double.parseDouble((String) (jsonObject.get("price_usd")));
			if (coinPrice <= maxPrice) {
				results.put(jsonObject);
			}

		}
		return results;
	}
	
	public JSONArray ReturnByPriceRange(Double minPrice, Double maxPrice) throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("price_usd")) {
				jsonObject.put("price_usd", "0.0");
			}

			coinPrice = Double.parseDouble((String) (jsonObject.get("price_usd")));
			if (coinPrice <= maxPrice && coinPrice >= minPrice) {
				results.put(jsonObject);
			}

		}
		return results;
	}





}
