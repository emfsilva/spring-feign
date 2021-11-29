package io.github.emfsilva.hrpayroll.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.emfsilva.hrpayroll.model.Payment;
import io.github.emfsilva.hrpayroll.services.PaymentService;

@RestController
@RequestMapping("/v1/payments")
public class PaymentController {
	
	private PaymentService service;
	
	@Autowired
	public PaymentController(PaymentService service) {
		super();
		this.service = service;
	}
	
	@GetMapping(value = "/{workerId}/days/{days}" )
	public ResponseEntity<Payment> getPayment(@PathVariable Long workerId, @PathVariable Integer days){
		Payment payment = service.getPayment(workerId, days);
		return ResponseEntity.ok().body(payment);
	}
	
}
