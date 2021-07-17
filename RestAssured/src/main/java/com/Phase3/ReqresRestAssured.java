package com.Phase3;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;

public class ReqresRestAssured {
	
	//instead of given() use this---
	RequestSpecification request = null;
	
	@Before
	public void beforeTest() {
		RestAssured.baseURI="https://reqres.in";
		//add the following statement
		request = RestAssured.given();
	}
	
//	@Test
//	public void ApiTest() {
//		System.out.println(given().get("/api/users/2").getBody().asString());
//	}
//	@Test
//	public void ApiTest2() {
//		System.out.println(given().get("/api/users/3").getBody().asString());
//	}
	
	@Test
	public void ApiTest() {
		System.out.println(request.get("/api/users/2").getBody().asString());
	}
	
	@Test
	public void ApiTest2() {
		System.out.println(request.get("/api/users/3").getBody().asString());
	}
	
	@Test
	public void ApiTest3() {
	String responseB =	request
				.queryParam("page", "4")
				.get("/api/users/")
				.getBody()
				.asString();
	System.out.println(responseB);
		
	}
	@Test //POST api
	public void ApiTest4() {
		String data ="{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}";
	String responseB =	request
				.body(data)
				.post("/api/users/")
				.getBody()
				.asString();
	System.out.println(responseB);
		
	}
	@Test //POST api with FILE
	public void ApiTest5() {
		String currentDir = System.getProperty("user.dir");
		String filepath = currentDir+ File.separator + "createUser.json";
		File file = new File(filepath);
	String filebody =	request
				.body(file)
				.post("/api/users/")
				.getBody()
				.asString();
	System.out.println(filebody);
	}
	
	@Test //POST api with Json data read
	public void ApiTest6() {
//		String currentDir = System.getProperty("user.dir");
//		String filepath = currentDir+ File.separator + "createUser.json";
//		File file = new File(filepath);
	JsonPath jsb =	request
				.queryParam("page", "2")
				.get("/api/users/")
				.getBody()
				.jsonPath();
	System.out.println("Data in json - "+jsb.get("data"));
	System.out.println("Data in json at data(0) - "+jsb.get("data[0]"));
	System.out.println("Data count = "+jsb.getList("data").size());
	System.out.println("Print List :: :: ::");
	for(int i=0; i< jsb.getList("data").size();i++) {
		System.out.println("JSB value -"+jsb.getList("data").get(i));
	}
		// HashMap
	System.out.println("HashMap result ----- \n\n");
	for(int i=0; i< jsb.getList("data").size();i++) {
		HashMap<String,String> hm = (HashMap<String,String>) jsb.getList("data").get(i);
		System.out.println(hm.get("email"));
	}
	
	}

	
}
