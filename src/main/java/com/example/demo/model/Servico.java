package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Servico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long servico_id;

	private double valor_servico;
	private double comissao;

	@ManyToOne
	@JoinColumn(name = "procedimento")
	private Procedimento procedimento;
	@ManyToOne
	@JoinColumn(name = "profissional")
	private Funcionario profissional;
	@ManyToOne
	@JoinColumn(name = "atendimento")
	private Atendimento atendimento;


	public double getValor_servico() {
		return valor_servico;
	}

	public void setValor_servico(double valor_servico) {
		this.valor_servico = valor_servico;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

}