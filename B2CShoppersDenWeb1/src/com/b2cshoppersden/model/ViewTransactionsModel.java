package com.b2cshoppersden.model;

public class ViewTransactionsModel {

	private int transactionId;
	private int paymentId;
	private String paymentType;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	@Override
	public String toString() {
		return "ViewTransactionsModel [transactionId=" + transactionId + ", paymentId=" + paymentId + ", paymentType="
				+ paymentType + "]";
	}
	
	
}
