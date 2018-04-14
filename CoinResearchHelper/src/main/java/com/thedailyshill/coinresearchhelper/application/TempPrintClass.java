package com.thedailyshill.coinresearchhelper.application;

import org.json.JSONException;

import com.thedailyshill.coinresearchhelper.services.tickerservices.DataRequest;

public class TempPrintClass {

	TempPrintClass(String dataSource) throws JSONException, Exception{
	System.out.println(new DataRequest().name(dataSource));
	System.out.println(new DataRequest().symbol(dataSource));
	System.out.println(new DataRequest().rank(dataSource));
	System.out.println(new DataRequest().usdPrice(dataSource));
	System.out.println(new DataRequest().btcPrice(dataSource));
	System.out.println(new DataRequest().volume24Hour(dataSource));
	System.out.println(new DataRequest().marketCap(dataSource));
	System.out.println(new DataRequest().currentSupply(dataSource));
	System.out.println(new DataRequest().maxSupply(dataSource));
	System.out.println(new DataRequest().change1Hour(dataSource));
	System.out.println(new DataRequest().change24Hour(dataSource));
	System.out.println(new DataRequest().change7Day(dataSource));
	}
}
