package com.xu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author xu
 * @date 2017-09-15
 */
public class User extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		System.out.println(request.getParameter("method")+"   "+request.getSession().getId());
		if(request.getParameter("method").equals("1")){

			request.getSession().setAttribute("tt","tt");
		}
		if(request.getParameter("method").equals("2")){

			String tt = request.getSession().getAttribute("tt").toString();
			System.out.println("bbbbbbbbbb:"+tt);
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.doPost(request,response);
	}
}
