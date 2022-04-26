package main;

import java.util.Date;

public class Payment {
	private String webShopId;
	private String customerId;
	private PaymentMethodEnum paymentMethod;
	private Integer amount;
	private String transferNum;
	private String cardNum;
	private Date paymentDate;
	
	public Payment(String webshopId,String customerId,PaymentMethodEnum paymentMethod,Integer amount,
			String transferNum,String cardNum,Date paymentDate) {
		this.setWebShopId(webshopId);
		this.setCustomerId(customerId);
		this.setPaymentMethod(paymentMethod);
		this.setAmount(amount);
		this.setTransferNum(transferNum);
		this.setCardNum(cardNum);
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

	public PaymentMethodEnum getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethodEnum paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getTransferNum() {
		return transferNum;
	}

	public void setTransferNum(String transferNum) {
		this.transferNum = transferNum;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
}
