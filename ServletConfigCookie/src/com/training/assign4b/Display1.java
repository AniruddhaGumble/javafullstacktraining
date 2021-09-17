package com.training.assign4b;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//URL is http://localhost:8084/ServletCookieEg/DisplayNews1?bgclr=red
/**
 * Servlet implementation class DisplayNews1
 */
@WebServlet("/DisplayNews1")
public class Display1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Display1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String clrstr = request.getParameter("bgclr");
		Cookie ck = null;
		
		if(clrstr == null) {
			clrstr = "#FF6550";
		}
		
		if(clrstr.trim().length()>0)
		{
			ck = new Cookie("bgcck",clrstr.trim());
		}
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<body bgcolor=\""+clrstr.trim()+"\" >"+
				"This is dummy text to show the backgropund color"+
				"<a href=\"DisplayNews2\">Next Page</a><br></body>");
		
		response.addCookie(ck);
		pw.close();
	}
}
