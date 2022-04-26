package controllers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Date;
import java.util.logging.Level;

import main.Customer;
import main.Main;
import main.Payment;
import main.PaymentMethodEnum;
import main.Webshop;

public class FileController {
	
	public void readCustomersFromFile(String fn) {
		try(BufferedReader br = new BufferedReader(new FileReader(fn,StandardCharsets.UTF_8))){
			String line;
			while((line=br.readLine())!=null) {
				String[] values = line.split(";");
				String webshopId = values[0];
				
				if(Main.getWebshopFromWebshopList(webshopId)==null) {
					Webshop webshop = new Webshop(values[0]);
					Main.addWebshopToWebshopList(webshop);
				}
				Webshop webshop = Main.getWebshopFromWebshopList(webshopId);
				Customer customer = new Customer(values[0],values[1],values[2],values[3]);
				webshop.addCustomerToCustomerList(customer);
				
				
			}
		} catch (FileNotFoundException e) {
			Main.logger.log(Level.SEVERE,e.getMessage(),e);
		} catch (IOException e) {
			
			Main.logger.log(Level.SEVERE,e.getMessage(),e);
		}
	}
	
	public void readPaymentsFromFile(String fn) {
		try(BufferedReader br = new BufferedReader(new FileReader(fn,StandardCharsets.UTF_8))){
			String line;
			while((line=br.readLine())!=null) {
				try {
				String[] values = line.split(";");
				
				Webshop webshop = Main.getWebshopFromWebshopList(values[0]);
				if(values[2].equals("card")) {
					values[2]=PaymentMethodEnum.CARD.name();
				}
				else {
					values[2]=PaymentMethodEnum.TRANSFER.name();
				}
				DateTimeFormatter f = DateTimeFormatter.ofPattern("uuuu.MM.dd").withResolverStyle(ResolverStyle.STRICT);
				LocalDate date = LocalDate.parse(values[6],f);
				
				Payment payment = new Payment(values[0],values[1],values[2],Integer.parseInt(values[3])
						,values[4],values[5],date);
				
				webshop.addPaymentToPaymentList(payment);
				}catch(DateTimeParseException e) {
					Main.logger.log(Level.SEVERE,e.getMessage(),e);
				}
				
			}
		} 
		catch (FileNotFoundException e) {
			Main.logger.log(Level.SEVERE,e.getMessage(),e);
			
		} catch (IOException e) {
			Main.logger.log(Level.SEVERE,e.getMessage(),e);
		} 
		
	}
	
	public void writeToFile(String fn,String a,String b,String c) {
		try {
			FileWriter fw = new FileWriter(fn,true);
			PrintWriter pw = new PrintWriter(fw);
			StringBuilder sb = new StringBuilder();
			sb.append(a);
			sb.append(";");
			sb.append(b);
			sb.append(";");
			sb.append(c);
			sb.append("\n");
			
			pw.write(sb.toString());
			pw.close();
		} catch (IOException e) {
			Main.logger.log(Level.SEVERE,e.getMessage(),e);
		}
	}

}
