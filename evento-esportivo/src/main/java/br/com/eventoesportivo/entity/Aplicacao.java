package br.com.eventoesportivo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="APLICACAO")
public class Aplicacao {
	@Id
	@Column(name = "ID_APLICACAO")
	private Long idAplicacao;

	@Column(name = "DESC_APLICACAO")
	private String descAplicacao;

	@Column(name = "DT_CRIACAO_APLICACAO")
	private LocalDateTime dataCriacaoAplicacao;
	
	@Column(name = "DT_EXCLUSAO_APLICACAO")
	private LocalDateTime dataExclusaoAplicacao;
	
}
