package main;

import java.time.LocalDate;
import java.util.Date;

public abstract class Payment {
	private String webShopId;
	private String customerId;
	private Integer amount;
	private LocalDate paymentDate;
	
	public Payment(String webshopId,String customerId,Integer amount,
			LocalDate paymentDate) {
		this.setWebShopId(webshopId);
		this.setCustomerId(customerId);
		this.setAmount(amount);
		this.setPaymentDate(paymentDate);
	}

	public String getWebShopId() {
		return webShopId;
	}

	public void setWebShopId(String webShopId) {
		this.webShopId = webShopId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}


	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
}
