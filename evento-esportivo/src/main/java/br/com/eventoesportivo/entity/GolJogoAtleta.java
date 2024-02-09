package br.com.eventoesportivo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema="DBFUT", name="GOL_JOGO_ATLETA")
public class GolJogoAtleta {
	@Id
	@Column(name = "ID_GOL_JOGO_ATLETA")
	private Long idGolJogoAtleta;

	@Column(name = "QTD_GOL")
	private Long qtdGol;
	
	//mapear atleta
	//mapear jogo
	//mapear sumula
}