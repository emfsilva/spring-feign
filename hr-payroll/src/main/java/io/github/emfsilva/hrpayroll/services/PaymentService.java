package io.github.emfsilva.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.emfsilva.hrpayroll.feigclients.WorkerFeignClient;
import io.github.emfsilva.hrpayroll.model.Payment;

@Service
public class PaymentService {
	
	private WorkerFeignClient feignClient;
	
	@Autowired
	public PaymentService(WorkerFeignClient feignClient) {
		this.feignClient = feignClient;
	}

	public Payment getPayment(long workerId, int days) {;
	
		Worker worker = feignClient.findById(workerId).getBody();
		return  new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
