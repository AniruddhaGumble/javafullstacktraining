package com.training.assign4a;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/ServletPatternMatch")
public class ServletPatternMatch extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletPatternMatch() {
		super();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String text = request.getParameter("text");
		String pattern = request.getParameter("pattern");
		List<String> match = new ArrayList<String>();

		List<String> items = Arrays.asList(text.split("\\s*,\\s*"));
		System.out.println("items: " + items);


		for (String item : items) {
			if (item.contains(pattern)) {
				match.add(item);
			}
		}

		PrintWriter writer = response.getWriter();

		String htmlRespone = "<html>";
		htmlRespone += "<h2>Your text is - " + match + "<br/>";
		htmlRespone += "</html>";

		writer.println(htmlRespone);
	}
}
