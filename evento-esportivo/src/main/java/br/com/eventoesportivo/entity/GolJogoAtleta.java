package br.com.eventoesportivo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema="DBFUT", name="GOL_JOGO_ATLETA")
public class GolJogoAtleta implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_GOL_JOGO_ATLETA")
	private Long idGolJogoAtleta;

	@Column(name = "QTD_GOL")
	private Long qtdGol;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ATLETA")
	private Atleta atleta;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_JOGO")
	private Jogo jogo;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SUMULA")
	private Sumula sumula;
}