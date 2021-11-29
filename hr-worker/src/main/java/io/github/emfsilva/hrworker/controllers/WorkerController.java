package io.github.emfsilva.hrworker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.emfsilva.hrworker.model.Worker;
import io.github.emfsilva.hrworker.service.WorkerService;

@RestController
@RequestMapping(value = "/v1/workers")
public class WorkerController {

	private WorkerService workerService;
	
	@Autowired
	public WorkerController(WorkerService workerService) {
		this.workerService = workerService;
	}

	@GetMapping("/")
	public ResponseEntity<List<Worker>> findAll() {
		List<Worker> list = workerService.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Worker> findById(@PathVariable Long id) {
		Worker obj = workerService.findbyId(id);
		return ResponseEntity.ok().body(obj);
	}
}
