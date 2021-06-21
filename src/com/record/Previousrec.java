package com.record;

public class Previousrec {
	//declare the variable
	private int rocord_id;
	private String transferee_accno;
	private String transferee_name;
	private String amount;
	private String beneficiary_name;
	private String beneficiary_accno;
	
	//return value from jsp file
		public Previousrec(int rocord_id, String transferee_accno, String transferee_name, String amount,
		String beneficiary_name, String beneficiary_accno) {
		
		this.rocord_id = rocord_id;
		this.transferee_accno = transferee_accno;
		this.transferee_name = transferee_name;
		this.amount = amount;
		this.beneficiary_name = beneficiary_name;
		this.beneficiary_accno = beneficiary_accno;
	}

		//getters
		public int getRocord_id() {
			return rocord_id;
		}

		public String getTransferee_accno() {
			return transferee_accno;
		}

		public String getTransferee_name() {
			return transferee_name;
		}

		public String getAmount() {
			return amount;
		}

		public String getBeneficiary_name() {
			return beneficiary_name;
		}

		public String getBeneficiary_accno() {
			return beneficiary_accno;
		}


		
}
