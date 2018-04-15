package com.thedailyshill.coinresearchhelper.services.tickerservices;

import org.json.JSONException;

public class MarketCapMover {

	public Long changeMarketCapForNewCoinValue(String marketCapDataSource, String movingCoin) throws JSONException, Exception{

		Long desiredMarketCap = Long.parseLong(new DataRequest().marketCap(marketCapDataSource).replace(".0", ""));
		Long movingCoinCurrentSupply = Long.parseLong(new DataRequest().currentSupply(movingCoin).replace(".0", ""));

		return desiredMarketCap / movingCoinCurrentSupply;
		
	}

}
