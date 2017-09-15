package com.sunbin.httpSession;

import org.junit.Test;

import java.io.IOException;


/**
 * @author xu
 * @classname TestClient
 * @description
 * @date 2017年09月15日
 */
public class TestClient {

	@Test
	public void test1() throws IOException {

		HttpSelfClient.get("http://10.0.9.161/auto/User?method=1");
		HttpSelfClient.get("http://10.0.9.161/auto/User?method=2");

	}
	@Test
	public void test2() throws IOException {




	}
}
