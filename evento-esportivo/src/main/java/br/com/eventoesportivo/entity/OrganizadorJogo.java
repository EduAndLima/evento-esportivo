package br.com.eventoesportivo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="ORGANIZADOR_JOGO")
public class OrganizadorJogo {
	@Id
	@Column(name = "ID_ORGANIZADOR_JOGO")
	private Long idOrganizadorJogo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ORGANIZADOR")
	private Organizador organizador;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_JOGO")
	private Jogo jogo;
	
	@Column(name = "DT_INCLUSAO_ORGANIZADOR_JOGO")
	private LocalDateTime dataInclusaoOrganizadorJogo;
	
	@Column(name = "DT_EXCLUSAO_ORGANIZADOR_JOGO")
	private LocalDateTime dataExclusaoOrganizadorJogo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SUMULA")
	private Sumula sumula;
}