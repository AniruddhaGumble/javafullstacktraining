package com.training.assign3b;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Card details class
class CardDetails {
	private int cardNum;
	private Date expiryDate;
	private int pinno;
	private String chname;

	public CardDetails(int cn, Date ed, int pn, String ch) {
		super();
		this.cardNum = cn;
		this.expiryDate = ed;
		this.pinno = pn;
		this.chname = ch;
	}

	public int getCardNumber() {
		return cardNum;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public int getPin() {
		return pinno;
	}

	public String getName() {
		return chname;
	}

	@Override
	public String toString() {
		return "CardDetails [cardNumr=" + cardNum + ", expiryDate=" + expiryDate + ", pinno=" + pinno + ", chname="
				+ chname + "]";
	}

}

//Payment gateway 2
class PaymentGateway2 {

	public void transact(CardDetails cardDetails, double amount) {
		System.out.println("Following are the details of transaction: ");
		System.out.println("Card Number: " + cardDetails.getCardNumber() + "\t PIN no: " + cardDetails.getPin()
				+ "\t Expiry " + "Date: " + cardDetails.getExpiryDate() + "\t ChName: " + cardDetails.getName());
		System.out.println("Following amount will be debited: " + amount);
	}

	public void getTransactions(Date fromDate, Date toDate) {
		System.out.println("Following are the transactions from " + fromDate + " to " + toDate);
	}
}

//Adapter
class PGAdapter2 extends PaymentGateway2 {
	public void transact(CardDetails cardDetails, double amount) {
		super.transact(cardDetails, amount);
	}

	public void getTransactions(String fromDate, String toDate) throws ParseException {
		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(fromDate);
		Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(toDate);
		super.getTransactions(date1, date2);
	}
}

public class PayGateway2 {

	public static void main(String[] args) throws ParseException {
		CardDetails card = new CardDetails(109876, new SimpleDateFormat("dd/MM/yyyy").parse("30/11/2027"), 9768, "Joe");

		PGAdapter2 pg2 = new PGAdapter2();
		pg2.transact(card, 1000.0);
		pg2.getTransactions("01/10/2021", "11/10/2021");

	}

}
