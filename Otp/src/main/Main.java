package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import controllers.FileController;

public class Main {

	private static ArrayList<Webshop> webshopList = new ArrayList<Webshop>();
	public final static Logger logger = Logger.getLogger(FileController.class.getName());
	private static FileController fc = new FileController();
	
	public static void main(String[] args) {
	
		try {
			FileHandler fileHandler = new FileHandler("application.log");
			logger.addHandler(fileHandler);
			
			fc.readCustomersFromFile("src/files/customer.csv");
			fc.readPaymentsFromFile("src/files/payments.csv");
			
			writeWebshopsCardAndTransferAmounts();
			
			
		} catch (SecurityException e) {
			logger.log(Level.SEVERE,e.getMessage(),e);
			
		} catch (IOException e) {
			logger.log(Level.SEVERE,e.getMessage(),e);
		}

	}
	
	public static void addWebshopToWebshopList(Webshop w) {
		webshopList.add(w);
	}
	
	public static Webshop getWebshopFromWebshopList(String id) {
		for(Webshop web:webshopList) {
			if(web.getWebShopId().equals(id)) {
				return web;
			}
		}
		return null;
	}
	
	private static void writeWebshopsCardAndTransferAmounts() {
		for(Webshop w:webshopList) {
			fc.writeToFile("src/files/report02.csv", w.getWebShopId(), w.sumAllCardPayment().toString(), w.sumAllTransferPayment().toString());
		}
	}

}
