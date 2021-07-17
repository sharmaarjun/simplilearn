package com.Phase3;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.internal.path.xml.NodeChildrenImpl;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;
import static org.hamcrest.Matchers.equalTo;
public class ReqresRestAssured4 {
	
	//instead of given() use this---
	RequestSpecification request = null;
	
	@Before
	public void beforeTest() {
//		RestAssured.baseURI="https://reqres.in";
		RestAssured.baseURI="https://postman-echo.com";
		//add the following statement
		request = RestAssured.given();
	}


	@Test
	public void ApiTest5_BasicAuth() {
		
	//using given >> when >> then
	//String responseValue =request
	String responseCode=request
					.given()
						.auth()
						.basic("postman", "password")
					.when()
						.get("basic-auth")
					.then()
						.log().all()
					.and()
                        .assertThat().statusCode(200)
                     .and()
                        .extract().response().getBody().asPrettyString();
                    
	System.out.println("Response code = "+responseCode);
	
	request.baseUri("https://reqres.in").get("/api/users").then().log().all();
	//System.out.println(responseValue);
	}
	
	@Test
	public void soapApi() {
		request.given().baseUri("https://www.dataaccess.com")
		.and().contentType("text/xml")
		.and().body("<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
				"<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"  <soap:Body>\r\n" + 
				"    <NumberToWords xmlns=\"http://www.dataaccess.com/webservicesserver/\">\r\n" + 
				"      <ubiNum>235</ubiNum>\r\n" + 
				"    </NumberToWords>\r\n" + 
				"  </soap:Body>\r\n" + 
				"</soap:Envelope>")
		.when().post("/webservicesserver/NumberConversion.wso")
		.then().log().body();
	}
	@Test
	public void soapApi2() {
		// https://www.dataaccess.com/webservicesserver/NumberConversion.wso?op=NumberToDollars
		request.given().baseUri("https://www.dataaccess.com")
		.basePath("/webservicesserver")
		.queryParam("op", "NumberToDollars")
		.and().contentType("text/xml")
		.and().body("<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
				"<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\r\n" + 
				"  <soap:Body>\r\n" + 
				"    <NumberToDollars xmlns=\"http://www.dataaccess.com/webservicesserver/\">\r\n" + 
				"      <dNum>123</dNum>\r\n" + 
				"    </NumberToDollars>\r\n" + 
				"  </soap:Body>\r\n" + 
				"</soap:Envelope>")
		.when().post("/NumberConversion.wso")
		.then().log().body()
		.and().assertThat().body("Envelope.Body.NumberToDollarsResponse.NumberToDollarsResult", equalTo("one hundred and twenty three dollars"));
		
	}
	
	@Test
	public void soapFile() {
		String projectPath = System.getProperty("user.dir");
		String filePath = projectPath+"\\testData\\payload_NumberConversionDollars.xml";
		File payloadFile = new File(filePath);
		System.out.println("Path of file is "+filePath);
		
		request.given().baseUri("https://www.dataaccess.com")
		.basePath("/webservicesserver")
		.queryParam("op", "NumberToDollars")
		.and().contentType("text/xml")
		.and().body(payloadFile)
		.when().post("/NumberConversion.wso")
		.then().log().body()
		.and().assertThat().body("Envelope.Body.NumberToDollarsResponse.NumberToDollarsResult", equalTo("one hundred and twenty three dollars"));
		
	}
	
	@Test
	public void validateXML() {
		//String path ="bookstore.book[0].title";
		String path ="**.find{it.author == 'Hannah'}.year";
		
//		String output =request.given().baseUri("https://chercher.tech")
        NodeChildrenImpl output =request.given().baseUri("https://chercher.tech")
		.basePath("/sample/api")
        .and().contentType("text/xml")
        .when().get("/books.xml")
        .then().log().body()
        .and().extract()
        .path(path);
		
		System.out.println("Path followed :"+path+" the output is"+output);
        
	}
	
	@Test
	public void httpErrors() {
		//if certification is required then avoid it by using relaxedHTTPSValidation
		request.relaxedHTTPSValidation().given().baseUri("https://www.picturematters.in")
		.when().get("/")
		.then().log().body();
	}
}
