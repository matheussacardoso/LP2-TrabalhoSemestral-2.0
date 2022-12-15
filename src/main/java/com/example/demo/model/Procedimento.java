package com.example.demo.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Procedimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long procedimento_id;

	private String tipo_procedimento;
	private String detalhe_procedimento;
	private double comissao_per;
	private Long descanso;

	@OneToMany(mappedBy = "procedimento")
	private List<Servico> servico;

	public String getTipo_procedimento() {
		return tipo_procedimento;
	}

	public void setTipo_procedimento(String tipo_procedimento) {
		this.tipo_procedimento = tipo_procedimento;
	}

	public String getDetalhe_procedimento() {
		return detalhe_procedimento;
	}

	public void setDetalhe_procedimento(String detalhe_procedimento) {
		this.detalhe_procedimento = detalhe_procedimento;
	}

	public double getComissao_per() {
		return comissao_per;
	}

	public void setComissao_per(double comissao_per) {
		this.comissao_per = comissao_per;
	}

	public Long getDescanso() {
		return descanso;
	}

	public void setDescanso(Long descanso) {
		this.descanso = descanso;
	}

}