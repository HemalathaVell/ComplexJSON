package org.login;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample {
	public static void main(String[] args) throws IOException, ParseException {
		FileReader fileReader = new FileReader("C:\\Users\\hemav\\eclipse-workspace\\ComplexJSON\\src\\test\\resources\\Sample.json");
		JSONParser jsonParser = new JSONParser();
		Object parse = jsonParser.parse(fileReader);
		//typecasting
		JSONObject jsonObject = (JSONObject)parse;
		System.out.println(jsonObject.get("id"));
		System.out.println(jsonObject.get("type"));
		System.out.println(jsonObject.get("name"));
		System.out.println(jsonObject.get("ppu"));
		//typecasting
		JSONObject jsonObject1 = (JSONObject)parse;
		Object object = jsonObject1.get("batters");
		//typecasting

		JSONObject jsonObject2 = (JSONObject)object;
		Object object1 = jsonObject2.get("batter");
		
		JSONArray jsonArray = (JSONArray)object1;
		for (int i = 0; i <jsonArray.size(); i++) {
			System.out.println(jsonArray.get(i));
			
		}
		JSONObject jsonObject3 = (JSONObject)parse;
		Object object2 = jsonObject3.get("topping");
		JSONArray jsonArray1 = (JSONArray)object2;
		for (int i = 0; i <jsonArray1.size(); i++) {
			System.out.println(jsonArray1.get(i));
		}	
		
	}

}
