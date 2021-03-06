package com.jersey.spring.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jersey.spring.TransactionBo;

@Component
@Path("/")
public class PaymentService {

	@Autowired
	TransactionBo transactionBo;

	@GET
	@Path("/mia")
	public Response savePayment() {

		String result = transactionBo.save();
//
		return Response.status(200).entity(result).build();

	}

}