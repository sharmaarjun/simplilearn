package com.simplilearnTests;

import java.io.File;
import java.util.Map;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class restStepsDef {

	RequestSpecification request= null;
	Response response=null;
	
	@Before
	public void setuo() {
		request= RestAssured.given();
	}
	
	@Given("I have base uri as {string}")
	public void i_have_base_uri_as(String baseUriValue) {
		System.out.println("base uri- "+baseUriValue);
		request.given().baseUri(baseUriValue);
	   	
	}
	@Given("I have base path as {string}")
	public void i_have_base_path_as(String basPathValue) {
		System.out.println("I have base path");
		 request.basePath(basPathValue);
	}
	@Given("I have following headers:")
	public void i_have_following_headers(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("I have following headers");
		Map<String,String> headersMap = dataTable.asMap(String.class,String.class);

		for(String key: headersMap.keySet()) {
			System.out.println("headerName="+key);
			System.out.println("header Value= "+headersMap.get(key));
			request.header(key, headersMap.get(key));
		}
	}
	@Given("I use the payload as {string}")
	public void i_use_the_payload_as(String fileName) {
		System.out.println("I use the payload ");

		String projectPath=System.getProperty("user.dir");  //current projet folder
		String pathToPayload =projectPath+"/testData/payload_"+fileName;
		File payloadFile = new File(pathToPayload);
		System.out.println("paylod file path ="+pathToPayload);

		request.body(payloadFile);
	}
	@When("I do a {string} request on {string}")
	public void i_do_a_request_on(String methodType, String urlPath) {
		System.out.println("I send request ");
		if (methodType.equalsIgnoreCase("post")) {
			System.out.println("calling post ....");
			response = request.post(urlPath);

		}
	}
	@Then("I log the Body")
	public void i_log_the_body() {
		System.out.println("I log the the body");
		response.then().log().body();
	}
	@Then("assert following in the body")
	public void assert_following_in_the_body(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   // throw new io.cucumber.java.PendingException();
	}
	
}
