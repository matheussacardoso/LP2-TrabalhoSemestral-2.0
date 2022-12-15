package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repo;

	public List<Cliente> listAll() {
		return (List<Cliente>) repo.findAll();
	}

	public void save(Cliente cliente) {
		repo.save(cliente);
	}

	public Cliente get(Integer id) throws ClienteNotFoundException {
		Optional<Cliente> result = Optional.ofNullable(repo.findById(id));
		if (result.isPresent()) {
			return result.get();
		}
		throw new ClienteNotFoundException("Não foi possível encontrar nenhum cliente com esse id: " + id);

	}

	/*
	public void delete(Integer id) {
		Long count = repo.countById(id);
		repo.deleteById(id);
	}
	*/

	/*
	 * public void delete(Integer id) throws ClienteNotFoundException { Long count =
	 * repo.countById(id); if (count == null || count == 0) { throw new
	 * ClienteNotFoundException("Não foi possível encontrar nenhum cliente com esse id: "
	 * + id); } Long id_long = Long.valueOf(id); repo.deleteById(id_long); }
	 */

}
