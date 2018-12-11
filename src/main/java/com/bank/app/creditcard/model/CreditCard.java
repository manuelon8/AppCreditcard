package com.bank.app.creditcard.model;

import java.util.Comparator;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "creditcard")
public class CreditCard implements Comparable<CreditCard> {

	 	@Id
	    private long cardNumber;
	    private String brand;
	    private String cardHolder;
	    //@JsonFormat(pattern = "dd-mm-yyyy")
	    private Date expirationDate;
	    
	    
		public CreditCard(long cardNumber, String brand, String cardHolder, Date expirationDate) {
			super();
			this.cardNumber = cardNumber;
			this.brand = brand;
			this.cardHolder = cardHolder;
			this.expirationDate = expirationDate;
		}


		public CreditCard() {
			super();
			// TODO Auto-generated constructor stub
		}

		
	    public long getCardNumber() {
			return cardNumber;
		}


		public void setCardNumber(long cardNumber) {
			this.cardNumber = cardNumber;
		}


		public String getBrand() {
			return brand;
		}


		public void setBrand(String brand) {
			this.brand = brand;
		}


		public String getCardHolder() {
			return cardHolder;
		}


		public void setCardHolder(String cardHolder) {
			this.cardHolder = cardHolder;
		}


		public Date getExpirationDate() {
			return expirationDate;
		}


		public void setExpirationDate(Date expirationDate) {
			this.expirationDate = expirationDate;
		}


		public boolean validateCard() {
	        Date cardDate = getExpirationDate();
	        Date now = new Date();
	        if (cardDate.compareTo(now) == 0 || cardDate.compareTo(now) > 0) return true;
	        else return false;
	    }

	    
		
		@Override
		public String toString() {
			return "Creditcard [cardNumber=" + cardNumber + ", brand=" + brand + ", cardHolder=" + cardHolder
					+ ", expirationDate=" + expirationDate + "]";
		}


		@Override
		public int compareTo(CreditCard o) {
			return Comparator.comparing(CreditCard::getCardHolder).compare(this, o);
			 
		}
	    
//		public int compareTo(CreditCard card) {
//	        return Comparator.comparing(CreditCard::getCardNumber).thenComparing(CreditCard::getBrand).thenComparing(CreditCard::getCardHolder).thenComparing(CreditCard::getExpirationDate).compare(this, card);
//	    } 	

}
