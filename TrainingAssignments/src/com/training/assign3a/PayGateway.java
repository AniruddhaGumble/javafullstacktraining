package com.training.assign3a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class PaymentGateway {

	public void checkOut(String cardNum, String expiryDate, int pinno, String chname) {
		System.out.println("Following are the details of transaction: ");
		System.out.println("Card Number: " + cardNum + "\t PIN no: " + pinno + "\t ExpiryDate: " + expiryDate
				+ "\t ChName: " + chname);
		System.out.println("Following amount will be debited: 1000");
	}

	public void viewTransactions(Date fromDate, Date toDate) {
		System.out.println("Following are the transactions from " + fromDate + " to " + toDate);
	}

}

class PayGAdapter extends PaymentGateway {
	public void checkOut(String cardNum, String expiryDate, int pinno, String chname) {
		super.checkOut(cardNum, expiryDate, pinno, chname);
	}

	public void viewTransactions(String fromDate, String toDate) throws ParseException {
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(fromDate);
		Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(toDate);
		super.viewTransactions(date1, date2);
	}
}

public class PayGateway {

	public static void main(String[] args) throws ParseException {
		PayGAdapter pg1 = new PayGAdapter();
		pg1.checkOut("109876", "30/11/2027", 9768, "Joe");
		pg1.viewTransactions("01/10/1899", "11/10/1899");
	}
}
