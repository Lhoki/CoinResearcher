package com.thedailyshill.coinresearchhelper.services;

import org.json.JSONArray;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class JsonPrettier {
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	JsonParser jp = new JsonParser();
	
	public JsonPrettier(JSONArray jsonArray){
	JsonElement je = jp.parse(jsonArray.toString());
	String prettyJsonString = gson.toJson(je);
	System.out.println(prettyJsonString);
	}
	
}
