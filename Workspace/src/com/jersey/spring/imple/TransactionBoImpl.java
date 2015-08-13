package com.jersey.spring.imple;

import org.springframework.stereotype.Component;

import com.jersey.spring.TransactionBo;

@Component(value = "transactionBo")
public class TransactionBoImpl implements TransactionBo{

	@Override
	public String save() {
		return "hi MIA";
	}

}
