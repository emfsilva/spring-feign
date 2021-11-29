package io.github.emfsilva.hrworker.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.emfsilva.hrworker.model.Worker;
import io.github.emfsilva.hrworker.repositories.WorkerRespository;

@Service
public class WorkerService {
	
	private WorkerRespository workerRespository;
	
	@Autowired
	public WorkerService(WorkerRespository workerRespository) {
		this.workerRespository = workerRespository;
	}
	
	public List<Worker> findAll() {
		return workerRespository.findAll();
	}
	
	public Worker findbyId(Long id) {
		Optional<Worker> obj = workerRespository.findById(id);
		return obj.get();
	
	}
}
