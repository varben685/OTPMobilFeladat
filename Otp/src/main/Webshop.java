package main;

import java.util.ArrayList;

public class Webshop {
	private String webShopId;
	private ArrayList<Costumer> costumers = new ArrayList<Costumer>();
	
	public Webshop(String webShopId,String costumerId) {
		this.setWebShopId(webShopId);
		this.setCostumerId(costumerId);
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

}
