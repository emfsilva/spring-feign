package io.github.emfsilva.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.emfsilva.hrworker.model.Worker;

public interface WorkerRespository extends JpaRepository<Worker, Long>{

}
