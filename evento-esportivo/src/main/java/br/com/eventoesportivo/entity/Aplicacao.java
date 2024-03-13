package br.com.eventoesportivo.entity;

import java.io.Serializable;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(schema="DBFUT", name="APLICACAO")
public class Aplicacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID_APLICACAO")
	private Long idAplicacao;

	@Column(name = "DESC_APLICACAO")
	private String descAplicacao;

	@Column(name = "DT_CRIACAO_APLICACAO")
	private LocalDateTime dataCriacaoAplicacao;
	
	@Column(name = "DT_EXCLUSAO_APLICACAO")
	private LocalDateTime dataExclusaoAplicacao;

	public Aplicacao() {
		this.dataCriacaoAplicacao = LocalDateTime.now();
	}
	
	
}
