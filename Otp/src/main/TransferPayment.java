package main;

import java.time.LocalDate;

public class TransferPayment extends Payment {

	private String transferNum;
	
	public TransferPayment(String webshopId, String customerId,Integer amount, String transferNum,
			LocalDate paymentDate) {
		super(webshopId, customerId,amount, paymentDate);
		setTransferNum(transferNum);
	}

	public String getTransferNum() {
		return transferNum;
	}

	public void setTransferNum(String transferNum) {
		this.transferNum = transferNum;
	}

	
	
}
