package com.record;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TransactionUpdateServlet")
public class TransactionUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String rid = request.getParameter("rid");
		String tacno = request.getParameter("tacno");
		String tname = request.getParameter("tname");
		String amount = request.getParameter("amount");
		String bname = request.getParameter("bname");
		String bacno = request.getParameter("bacno");
		
		boolean True;
		
		True = TransferFundsDBUtil.updatetransferfunds(rid, tacno, tname, amount, bname, bacno);
		
		if(True == true) {
			
			List<Previousrec> prevDetails = TransferFundsDBUtil.getTransactionDetails(rid);
			request.setAttribute("prevDetails", prevDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("record.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<Previousrec> prevDetails = TransferFundsDBUtil.getTransactionDetails(rid);
			request.setAttribute("prevDetails", prevDetails);
			
			RequestDispatcher dis =  request.getRequestDispatcher("record.jsp");
			dis.forward(request, response);
		}
	
	}
	
}
