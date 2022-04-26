package main;

import java.time.LocalDate;
import java.util.Date;

public class Payment {
	private String webShopId;
	private String customerId;
	private String paymentMethod;
	private Integer amount;
	private String transferNum;
	private String cardNum;
	private LocalDate paymentDate;
	
	public Payment(String webshopId,String customerId,String paymentMethod,Integer amount,
			String transferNum,String cardNum,LocalDate paymentDate) {
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

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
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

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
}
