package com.xu;

import com.sunbin.httpSession.HttpSelfClient;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xu
 * @date 2017-09-15
 */
public class User2 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			HttpSelfClient.get("http://120.26.162.179:3317/auto/User?method=2");
	}
}
