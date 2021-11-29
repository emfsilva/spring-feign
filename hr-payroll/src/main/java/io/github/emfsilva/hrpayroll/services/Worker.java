package io.github.emfsilva.hrpayroll.services;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Worker implements Serializable {
	private static final long serialVersionUID = 7401159271492577027L;
	
	private Long id;
	private String name;
	private Double dailyIncome;
	public Long getId() {
		return id;
	}
}
