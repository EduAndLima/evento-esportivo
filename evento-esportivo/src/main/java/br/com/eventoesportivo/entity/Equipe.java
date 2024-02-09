package br.com.eventoesportivo.entity;

import java.sql.Blob;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema="DBFUT", name="EQUIPE")
public class Equipe {
	@Id
	@Column(name = "ID_EQUIPE")
	private Long idEquipe;

	@Column(name = "NOME_EQUIPE")
	private String nomeEquipe;

	@Column(name = "DT_CRIACAO_EQUIPE")
	private LocalDateTime dataCriacaoEquipe;
	
	@Column(name = "DT_EXCLUSAO_EQUIPE")
	private LocalDateTime dataExclusaoEquipe;
	
	@Column(name = "ESCUDO_EQUIPE")
	private Blob escudoEquipe;
	
	@Column(name = "FOTO_EQUIPE")
	private Blob fotoEquipe;
}