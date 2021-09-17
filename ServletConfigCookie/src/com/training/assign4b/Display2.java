package com.training.assign4b;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayNews2
 */
@WebServlet("/DisplayNews2")
public class Display2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Display2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Cookie[] cks = request.getCookies();
		
		System.out.println(cks[0].getName()+" "+cks[0].getValue());
		
		String sbgclr = cks[0].getValue().trim();
		
		PrintWriter pw = response.getWriter();
		
		pw.println("<body bgcolor=\""+sbgclr+"\" >"+
				"This is dummy texttttttttttttttttttt to show the backgropund color"+
				"<a href=\"DisplayNews1\">Next Page</a><br></body>");
		
		pw.close();
	}
}
