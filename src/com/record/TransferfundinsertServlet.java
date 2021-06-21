package com.record;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/TransferfundinsertServlet")
public class TransferfundinsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tacno = request.getParameter("tacno");
		String tname = request.getParameter("tname");
		String amount = request.getParameter("amount");
		String bname = request.getParameter("bname");
		String bacno = request.getParameter("bacno");
		
		
		boolean True;
		
		True = TransferFundsDBUtil.inserttransferfunds(tacno, tname, amount, bname, bacno);
		
		if(True == true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
