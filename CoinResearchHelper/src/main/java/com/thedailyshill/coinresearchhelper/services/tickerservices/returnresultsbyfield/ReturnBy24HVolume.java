package com.thedailyshill.coinresearchhelper.services.tickerservices.returnresultsbyfield;

import org.json.JSONArray;
import org.json.JSONObject;

import com.thedailyshill.coinresearchhelper.services.JsonPrettier;
import com.thedailyshill.coinresearchhelper.services.tickerservices.TickerRequest;

public class ReturnBy24HVolume {

	protected TickerRequest tr = new TickerRequest();
	protected JsonPrettier jp = new JsonPrettier();
	protected Long availableSupply;
	protected Long volumeBy24Hour;
	protected Double coinPrice;
	
	public JSONArray ReturnByMin24Volume(Long min24HourVolume) throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("24h_volume_usd")) {
				jsonObject.put("24h_volume_usd", "0.0");
			}

			volumeBy24Hour = Long.parseLong(((String) jsonObject.get("24h_volume_usd")).replaceAll(".[^0-9]", ""));
			if (volumeBy24Hour > min24HourVolume) {
				results.put(jsonObject);
			}

		}
		return results;
	}
		
	public JSONArray ReturnByMax24Volume(Long max24HourVolume) throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("24h_volume_usd")) {
				jsonObject.put("24h_volume_usd", "0.0");
			}

			volumeBy24Hour = Long.parseLong(((String) jsonObject.get("24h_volume_usd")).replaceAll(".[^0-9]", ""));
			if (volumeBy24Hour < max24HourVolume) {
				results.put(jsonObject);
			}

		}
		return results;
	}

	public JSONArray ReturnBy24HVoumeRange(Long min24HourVolume, Long max24HourVolume) throws Exception {

		tr.returnTickerRequest("?limit=0");
		JSONArray tickerResponse = new JSONArray(tr.returnTickerRequest().toString());
		JSONArray results = new JSONArray();

		for (int i = 0; i < tickerResponse.length(); i++) {

			JSONObject jsonObject = tickerResponse.getJSONObject(i);

			if (jsonObject.isNull("24h_volume_usd")) {
				jsonObject.put("24h_volume_usd", "0.0");
			}

			volumeBy24Hour = Long.parseLong(((String) jsonObject.get("24h_volume_usd")).replaceAll(".[^0-9]", ""));
			if (volumeBy24Hour >= min24HourVolume && volumeBy24Hour <= max24HourVolume) {
				results.put(jsonObject);
			}

		}
		return results;
	}


}
