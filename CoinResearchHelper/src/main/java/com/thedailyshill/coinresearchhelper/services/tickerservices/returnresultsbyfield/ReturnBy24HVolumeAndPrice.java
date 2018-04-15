package com.thedailyshill.coinresearchhelper.services.tickerservices.returnresultsbyfield;

import org.json.JSONArray;
import org.json.JSONObject;

import com.thedailyshill.coinresearchhelper.services.JsonPrettier;
import com.thedailyshill.coinresearchhelper.services.tickerservices.TickerRequest;

public class ReturnBy24HVolumeAndPrice {

	protected TickerRequest tr = new TickerRequest();
	protected JsonPrettier jp = new JsonPrettier();
	protected Long availableSupply;
	protected Long volumeBy24Hour;
	protected Double coinPrice;

	public JSONArray ReturnByMinPriceAndMin24HVolume(Double minPrice, Long min24HourVolume) throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("price_usd")) {
				jsonObject.put("price_usd", "0.0");
			}

			if (jsonObject.isNull("24h_volume_usd")) {
				jsonObject.put("24h_volume_usd", "0.0");
			}

			coinPrice = Double.parseDouble((String) (jsonObject.get("price_usd")));
			volumeBy24Hour = Long.parseLong(((String) jsonObject.get("24h_volume_usd")).replaceAll(".[^0-9]", ""));

			if ((coinPrice >= minPrice) && (volumeBy24Hour >= min24HourVolume)) {
				results.put(jsonObject);
			}

		}
		return results;
	}

	public JSONArray ReturnByMaxPriceAndMin24HVolume(Double maxPrice, Long min24HourVolume) throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("price_usd")) {
				jsonObject.put("price_usd", "0.0");
			}

			if (jsonObject.isNull("24h_volume_usd")) {
				jsonObject.put("24h_volume_usd", "0.0");
			}

			coinPrice = Double.parseDouble((String) (jsonObject.get("price_usd")));
			volumeBy24Hour = Long.parseLong(((String) jsonObject.get("24h_volume_usd")).replaceAll(".[^0-9]", ""));

			if ((coinPrice <= maxPrice) && (volumeBy24Hour >= min24HourVolume)) {
				results.put(jsonObject);
			}

		}
		return results;
	}

	public JSONArray ReturnByPriceRangeAndMin24HVolume(Double minPrice, Double maxPrice, Long min24HourVolume)
			throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("price_usd")) {
				jsonObject.put("price_usd", "0.0");
			}

			if (jsonObject.isNull("24h_volume_usd")) {
				jsonObject.put("24h_volume_usd", "0.0");
			}

			coinPrice = Double.parseDouble((String) (jsonObject.get("price_usd")));
			volumeBy24Hour = Long.parseLong(((String) jsonObject.get("24h_volume_usd")).replaceAll(".[^0-9]", ""));

			if ((coinPrice <= maxPrice && coinPrice >= minPrice) && (volumeBy24Hour >= min24HourVolume)) {
				results.put(jsonObject);
			}

		}
		return results;
	}

	public JSONArray ReturnByPriceRangeAndMax24HVolume(Double minPrice, Double maxPrice, Long max24HourVolume)
			throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("price_usd")) {
				jsonObject.put("price_usd", "0.0");
			}

			if (jsonObject.isNull("24h_volume_usd")) {
				jsonObject.put("24h_volume_usd", "0.0");
			}

			coinPrice = Double.parseDouble((String) (jsonObject.get("price_usd")));
			volumeBy24Hour = Long.parseLong(((String) jsonObject.get("24h_volume_usd")).replaceAll(".[^0-9]", ""));

			if ((coinPrice <= maxPrice && coinPrice >= minPrice) && (volumeBy24Hour <= max24HourVolume)) {
				results.put(jsonObject);
			}

		}
		return results;
	}

	public JSONArray ReturnByMinPriceAnd24HVolumeRange(Double minPrice, Long min24HourVolume, Long max24HourVolume)
			throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("price_usd")) {
				jsonObject.put("price_usd", "0.0");
			}

			if (jsonObject.isNull("24h_volume_usd")) {
				jsonObject.put("24h_volume_usd", "0.0");
			}

			coinPrice = Double.parseDouble((String) (jsonObject.get("price_usd")));
			volumeBy24Hour = Long.parseLong(((String) jsonObject.get("24h_volume_usd")).replaceAll(".[^0-9]", ""));

			if ((coinPrice >= minPrice) && (volumeBy24Hour >= min24HourVolume && volumeBy24Hour <= max24HourVolume)) {
				results.put(jsonObject);
			}

		}
		return results;
	}

	public JSONArray ReturnByMaxPriceAnd24HVolumeRange(Double maxPrice, Long min24HourVolume, Long max24HourVolume)
			throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("price_usd")) {
				jsonObject.put("price_usd", "0.0");
			}

			if (jsonObject.isNull("24h_volume_usd")) {
				jsonObject.put("24h_volume_usd", "0.0");
			}

			coinPrice = Double.parseDouble((String) (jsonObject.get("price_usd")));
			volumeBy24Hour = Long.parseLong(((String) jsonObject.get("24h_volume_usd")).replaceAll(".[^0-9]", ""));

			if ((coinPrice <= maxPrice) && (volumeBy24Hour >= min24HourVolume && volumeBy24Hour <= max24HourVolume)) {
				results.put(jsonObject);
			}

		}
		return results;
	}

	public JSONArray ReturnByPriceRangeAnd24HVolumeRange(Double minPrice, Double maxPrice, Long min24HourVolume,
			Long max24HourVolume) throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("price_usd")) {
				jsonObject.put("price_usd", "0.0");
			}

			if (jsonObject.isNull("24h_volume_usd")) {
				jsonObject.put("24h_volume_usd", "0.0");
			}

			coinPrice = Double.parseDouble((String) (jsonObject.get("price_usd")));
			volumeBy24Hour = Long.parseLong(((String) jsonObject.get("24h_volume_usd")).replaceAll(".[^0-9]", ""));

			if ((coinPrice <= maxPrice && coinPrice >= minPrice)
					&& (volumeBy24Hour >= min24HourVolume && volumeBy24Hour <= max24HourVolume)) {
				results.put(jsonObject);
			}

		}
		return results;
	}

}
