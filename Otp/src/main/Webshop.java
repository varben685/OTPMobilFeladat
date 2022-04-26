package main;

import java.util.ArrayList;

public class Webshop {
	private String webShopId;
	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	private ArrayList<Payment> paymentList = new ArrayList<Payment>();
	
	public Webshop(String webShopId) {
		this.setWebShopId(webShopId);
		
	}

	public String getWebShopId() {
		return webShopId;
	}

	public void setWebShopId(String webShopId) {
		this.webShopId = webShopId;
	}

	public void addCustomerToCustomerList(Customer c) {
		customerList.add(c);
	}
	public void addPaymentToPaymentList(Payment p) {
		paymentList.add(p);
	}
	
	public Integer sumAllCardPayment() {
		Integer sum=0;
		for(Payment p:paymentList) {
			if(p.getClass().equals(CardPayment.class)) {
				sum+=p.getAmount();
			}
		}
		return sum;
	}
	
	public Integer sumAllTransferPayment() {
		Integer sum=0;
		for(Payment p:paymentList) {
			if(p.getClass().equals(TransferPayment.class)) {
				sum+=p.getAmount();
			}
		}
		return sum;
	}
	
	public ArrayList<Customer> getSumCustomersPayments(){
		ArrayList<Customer> list = new ArrayList<Customer>();
		for(Customer c:customerList) {
			for(Payment p:paymentList) {
				if(c.getCostumerId().equals(p.getCustomerId())) {
					c.addAmountToSumAmount(p.getAmount());
				}
			}
			list.add(c);
		}
		return list;
	}

}
