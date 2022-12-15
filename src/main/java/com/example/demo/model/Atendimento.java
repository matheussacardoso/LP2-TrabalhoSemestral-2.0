package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Atendimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long atendimento_id;

	private String feedback;
	private long status;
	private Date dt_hora_chegada;
	private long duracao;
	private double valor_final;

	@OneToMany(mappedBy = "atendimento")
	private List<Servico> servico;

	@OneToOne
	@JoinColumn(name = "agendamento_id")
	private Agendamento agendamento;

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public long getStatus() {
		return status;
	}

	public void setStatus(long status) {
		this.status = status;
	}

	public Date getDt_hora_chegada() {
		return dt_hora_chegada;
	}

	public void setDt_hora_chegada(Date dt_hora_chegada) {
		this.dt_hora_chegada = dt_hora_chegada;
	}

	public long getDuracao() {
		return duracao;
	}

	public void setDuracao(long duracao) {
		this.duracao = duracao;
	}

	public double getValor_final() {
		return valor_final;
	}

	public void setValor_final(double valor_final) {
		this.valor_final = valor_final;
	}

}