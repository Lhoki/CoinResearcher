package com.thedailyshill.coinresearchhelper.services.tickerservices;

import org.json.JSONException;

public class DataRequest extends ReturnSingleData{

	public String marketCap(String dataSource) throws JSONException, Exception {
		return this.returnSingleData("market_cap_usd", dataSource);
	}

}
