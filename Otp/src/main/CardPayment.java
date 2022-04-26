package main;

import java.time.LocalDate;

public class CardPayment extends Payment {
	private String cardNum;

	public CardPayment(String webshopId, String customerId,Integer amount,
			String cardNum, LocalDate paymentDate) {
		super(webshopId, customerId, amount, paymentDate);
		setCardNum(cardNum);
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

}
