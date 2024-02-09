package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema="DBFUT", name="SUMULA")
public class Sumula {
	
	@Id
	@Column(name = "ID_SUMULA")
	private Long idSumula;
	//mapear jogo
	//mapear organizador
	//mapear evento_equipe
}