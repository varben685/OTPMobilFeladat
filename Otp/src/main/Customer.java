package main;

public class Customer {

	private String webShopId;
	private String costumerId;
	private String costumerName;
	private String costumerAddress;
	private Integer sumAmount;
	
	public Customer (String webShopId,String costumerId,String costumerName,String costumerAddress) {
		this.setWebShopId(webShopId);
		this.setCostumerId(costumerId);
		this.setCostumerName(costumerName);
		this.setCostumerAddress(costumerAddress);
		this.setSumAmount(0);
	}

	public String getWebShopId() {
		return webShopId;
	}

	public void setWebShopId(String webShopId) {
		this.webShopId = webShopId;
	}

	public String getCostumerId() {
		return costumerId;
	}

	public void setCostumerId(String costumerId) {
		this.costumerId = costumerId;
	}

	public String getCostumerName() {
		return costumerName;
	}

	public void setCostumerName(String costumerName) {
		this.costumerName = costumerName;
	}

	public String getCostumerAddress() {
		return costumerAddress;
	}

	public void setCostumerAddress(String costumerAddress) {
		this.costumerAddress = costumerAddress;
	}

	public Integer getSumAmount() {
		return sumAmount;
	}

	public void setSumAmount(Integer sumAmount) {
		this.sumAmount = sumAmount;
	}
	
	public void addAmountToSumAmount(Integer i) {
		this.sumAmount+=i;
	}
}
