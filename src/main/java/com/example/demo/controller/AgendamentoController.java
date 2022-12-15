package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.model.Agendamento;
import com.example.demo.service.AgendamentoService;

@Controller
public class AgendamentoController {

	@Autowired
	private AgendamentoService service;
	/*
	@RequestMapping("/")
    public String index() {
        return "index";
	}
	*/
	@GetMapping("/index/show")
	public String showAgendamentoList(Model model) {
		List<Agendamento> listAgendamento = service.listAll();
		model.addAttribute("listAgendamento", listAgendamento);
		return "index_show";
	}

	@GetMapping("/index")
	public String showNewAgendamento(Model model) {
		model.addAttribute("agendamento", new Agendamento());
		return "index";
	}

	@PostMapping("/index/save")
	public String saveAgendamento(Agendamento agendamento, RedirectAttributes ra) {
		service.save(agendamento);
		ra.addFlashAttribute("message", "Agendamento feito com sucesso!");
		return "redirect:/index";
	}
}
