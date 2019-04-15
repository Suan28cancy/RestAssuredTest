package com.restassured.demo.restassured;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.get;

public class SampleRestAssured {

	@Before
	public void setup() {
		RestAssured.baseURI = "http://zippopotam.us/us";
		RestAssured.proxy("www-proxy.lmig.com", 80);
	}

	@Test
	public void test() {
		get("/90210").then().assertThat().body("places[0].'place name'", equalTo("Beverly Hills"));
	}
}
