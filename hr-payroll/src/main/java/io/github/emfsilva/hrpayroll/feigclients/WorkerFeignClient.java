package io.github.emfsilva.hrpayroll.feigclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import io.github.emfsilva.hrpayroll.services.Worker;

@Component
@FeignClient(name = "hr-worker", url= "localhost:8001", path = "/v1/workers")
public interface WorkerFeignClient {
	
	@GetMapping(value = "/{id}")
	ResponseEntity<Worker> findById(@PathVariable Long id);
}
