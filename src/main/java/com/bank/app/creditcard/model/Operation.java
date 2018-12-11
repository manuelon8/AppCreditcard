package com.bank.app.creditcard.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operation")
public class Operation {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private long amount;
    private long cardNumber;
    private double operationRate;
    
    
    
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Operation(long id, long amount, long cardNumber, double operationRate) {
		super();
		this.id = id;
		this.amount = amount;
		this.cardNumber = cardNumber;
		this.operationRate = operationRate;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public long getAmount() {
		return amount;
	}



	public void setAmount(long amount) {
		this.amount = amount;
	}



	public long getCardNumber() {
		return cardNumber;
	}



	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}



	public double getOperationRate() {
		return operationRate;
	}



	public void setOperationRate(double operationRate) {
		this.operationRate = operationRate;
	}



	@Override
	public String toString() {
		return "Operation [id=" + id + ", amount=" + amount + ", cardNumber=" + cardNumber + ", operationRate="
				+ operationRate + "]";
	}
    
    

}
