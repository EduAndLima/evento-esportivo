package br.com.eventoesportivo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="ORGANIZADOR_JOGO")
public class OrganizadorJogo {
	@Id
	@Column(name = "ID_ORGANIZADOR_JOGO")
	private Long idOrganizadorJogo;

	// mapear organizador
	//mapear jogo
	
	@Column(name = "DT_INCLUSAO_ORGANIZADOR_JOGO")
	private LocalDateTime dataInclusaoOrganizadorJogo;
	
	@Column(name = "DT_EXCLUSAO_ORGANIZADOR_JOGO")
	private LocalDateTime dataExclusaoOrganizadorJogo;
	
	//mapear sumula
}