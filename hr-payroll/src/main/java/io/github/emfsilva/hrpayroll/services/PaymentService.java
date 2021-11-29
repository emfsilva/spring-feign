package io.github.emfsilva.hrpayroll.services;

import org.springframework.stereotype.Service;

import io.github.emfsilva.hrpayroll.model.Payment;

@Service
public class PaymentService {
	
	public Payment getPayment(long workerId, int days) {
		return  new Payment("Bob", 200.0, days);
	}
}
