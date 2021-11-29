package io.github.emfsilva.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import io.github.emfsilva.hrpayroll.model.Payment;

@Service
public class PaymentService {
	
	@Value("${hr-worker.host}")
	private String workerHost;
	
	private RestTemplate restTemplate;
	
	@Autowired
	public PaymentService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	public Payment getPayment(long workerId, int days) {
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+workerId);
		
		Worker worker = restTemplate.getForObject(workerHost + "v1/workers/{id}", Worker.class, uriVariables);
		return  new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
