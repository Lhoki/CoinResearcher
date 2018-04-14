package com.thedailyshill.coinresearchhelper.services.tickerservices;

import org.json.JSONException;

public class DataRequest extends ReturnSingleData{

	public String name(String dataSource) throws JSONException, Exception {
		return this.returnSingleData("name", dataSource);
	}
	
	public String symbol(String dataSource) throws JSONException, Exception {
		return this.returnSingleData("symbol", dataSource);
	}
	
	public String rank(String dataSource) throws JSONException, Exception {
		return this.returnSingleData("rank", dataSource);
	}
	
	public String usdPrice(String dataSource) throws JSONException, Exception {
		return this.returnSingleData("price_usd", dataSource);
	}
	
	public String btcPrice(String dataSource) throws JSONException, Exception {
		return this.returnSingleData("price_btc", dataSource);
	}
	
	public String volume24Hour(String dataSource) throws JSONException, Exception {
		return this.returnSingleData("24h_volume_usd", dataSource);
	}
	
	public String marketCap(String dataSource) throws JSONException, Exception {
		return this.returnSingleData("market_cap_usd", dataSource);
	}
	
	public String currentSupply(String dataSource) throws JSONException, Exception {
		return this.returnSingleData("available_supply", dataSource);
	}
	
	public String maxSupply(String dataSource) throws JSONException, Exception {
		return this.returnSingleData("max_supply", dataSource);
	}
	
	public String change1Hour(String dataSource) throws JSONException, Exception {
		return this.returnSingleData("percent_change_1h", dataSource);
	}
	
	public String change24Hour(String dataSource) throws JSONException, Exception {
		return this.returnSingleData("percent_change_24h", dataSource);
	}
	
	public String change7Day(String dataSource) throws JSONException, Exception {
		return this.returnSingleData("percent_change_7d", dataSource);
	}
	
	
}
