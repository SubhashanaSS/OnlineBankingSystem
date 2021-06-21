package com.record;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteTransactionServlet")
public class deleteTransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("rid"); //declare variable and get values from jsp
		
		boolean True;
		
		True = TransferFundsDBUtil.deleteTransaction(id); //get boolean value from database
		
		if(True == true) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("transferfundinsert.jsp"); //success
			dispatcher.forward(request, response);
		}
		else {
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("record.jsp"); //unsuccess 
			dispatcher.forward(request, response);
		}
	}

}
