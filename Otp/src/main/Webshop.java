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

}
