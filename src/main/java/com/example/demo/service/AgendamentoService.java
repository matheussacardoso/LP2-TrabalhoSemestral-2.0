package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Agendamento;
import com.example.demo.repository.AgendamentoRepository;

@Service
public class AgendamentoService {
	
	@Autowired
	private AgendamentoRepository repo;
	
	public List<Agendamento> listAll() {
		return (List<Agendamento>) repo.findAll();
	}

	public void save(Agendamento agendamento) {
		repo.save(agendamento);
	}
	
}
