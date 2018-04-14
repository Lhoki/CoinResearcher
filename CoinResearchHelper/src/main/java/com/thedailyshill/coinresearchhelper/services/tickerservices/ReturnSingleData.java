package com.thedailyshill.coinresearchhelper.services.tickerservices;

import org.json.JSONException;
import org.json.JSONObject;

public abstract class ReturnSingleData {

	private TickerRequest tr = new TickerRequest();

	public String returnSingleData(String desiredData, String dataSource) throws JSONException, Exception {

		JSONObject myResponse = new JSONObject(tr.returnTickerRequest(dataSource).toString().replace("[", ""));
		if (myResponse.isNull(desiredData)) {
			return "No Data";
		} else {
			return myResponse.getString(desiredData);
		}
		

	}
}
