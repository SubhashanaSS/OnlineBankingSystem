package com.record;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PreviousrecServlet")
public class PreviousrecServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String transferee_Accno = request.getParameter("transacc");
		String beneficiary_Accno = request.getParameter("benefacc");
		
		try {
			List<Previousrec> prevDetails = TransferFundsDBUtil.validate(transferee_Accno, beneficiary_Accno);
			request.setAttribute("prevDetails", prevDetails);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("record.jsp");
		dis.forward(request, response);
		 
	}

}
