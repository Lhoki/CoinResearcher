package com.thedailyshill.coinresearchhelper.services.tickerservices;

import org.json.JSONException;
import org.json.JSONObject;

public class ReturnSingleData {

	private String cryptoName;
	private TickerRequest tr = new TickerRequest();

	public String returnSingleData(String desiredData, String dataSource) throws JSONException, Exception {

		JSONObject myResponse = new JSONObject(tr.returnTickerRequest(dataSource).toString().replace("[", ""));
		return myResponse.getString(desiredData);

	}
}
