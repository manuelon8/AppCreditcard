package com.bank.app.creditcard.rest.controller.impl;

import java.util.List;

import com.bank.app.creditcard.model.CreditCard;
import com.bank.app.creditcard.model.Operation;
import com.bank.app.creditcard.rest.controller.inter.OperationController;

public class OperationControllerimpl  implements OperationController{

	@Override
	public void create(Operation operation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Operation> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation getOperation(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double calculateOperationRateFromCard(CreditCard creditcard) {
		// TODO Auto-generated method stub
		return 0;
	}

}
