package com.record;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class TransferFundsDBUtil {
	//declare variables
	private static boolean success;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static List<Previousrec> validate(String transfereeAccno, String beneficiaryAccno){
		//create list object
		ArrayList<Previousrec> prevrec = new ArrayList<>();
			
		try {
			con = DBConnect.getConnection(); //get db connection
			stmt = con.createStatement();
			String sql = "select * from records where transferee_accno = '"+transfereeAccno+"' and beneficiary_accno = '"+beneficiaryAccno+"' ";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				//validate
				int rocord_Id            = rs.getInt(1);
				String transferee_Accno  = rs.getString(2);
				String transferee_Name   = rs.getString(3);
				String amounT            = rs.getString(4);
				String beneficiary_Name  = rs.getString(5);
				String beneficiary_Accno = rs.getString(6);
				
				
				Previousrec pre = new Previousrec(rocord_Id, transferee_Accno, transferee_Name, amounT, beneficiary_Name, beneficiary_Accno);// assign variables
				prevrec.add(pre);  
			}
				
		}
		catch(Exception ex) {
			ex.printStackTrace(); //display error
		}
		
		return prevrec;
	}
	
	public static boolean inserttransferfunds(String transferee_Accno, String transferee_Name, String amounT, String beneficiary_Name, String beneficiary_Accno) {
		
		boolean success = false; 
		
		//validate
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into records values (0, '"+transferee_Accno+"', '"+transferee_Name+"', '"+amounT+"', '"+beneficiary_Name+"', '"+beneficiary_Accno+"')";
			int rs = stmt.executeUpdate(sql);
			
			if (rs > 0) {
				 success = true;
			}
			else {
				success = false;
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		  
		return success;
	}
	
	public static boolean updatetransferfunds(String rocord_id, String transferee_accno, String transferee_name, String amount, String beneficiary_name, String beneficiary_accno) {
		
		//validate
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update records set amount = '"+amount+"'"
					+ "where rocord_id = '"+rocord_id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				success = true;
			}
			else {
				success = false;
			}
		
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return success;
	}
	
	public static List<Previousrec> getTransactionDetails(String Id){
		
		int convertedID = Integer.parseInt(Id);
		
		ArrayList<Previousrec> rec = new ArrayList<>();
		
		//validate
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from records where rocord_id = '"+convertedID+"'";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int rocord_id = rs.getInt(1);
				String transferee_accno = rs.getString(2);
				String transferee_name = rs.getString(3);
				String amount = rs.getString(4);
				String beneficiary_name = rs.getString(5);
				String beneficiary_accno = rs.getString(6);
				
				Previousrec p = new Previousrec(rocord_id, transferee_accno, transferee_name, amount, beneficiary_name, beneficiary_accno);
				rec.add(p);
				
			}
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return rec;
	}
	
	public static boolean deleteTransaction(String id) {
		
		int convId = Integer.parseInt(id);
		
		//validate
		
		try {
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "delete from records where rocord_id = '"+convId+"'";
			int r = stmt.executeUpdate(sql);
			
			if (r > 0) {
				success = true;
			}
			else {
				success = false;
			}
			
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return success;
	}
}
