package br.com.eventoesportivo.entity;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="SUMULA")
public class Sumula{
    @Id
	@Column(name = "ID_SUMULA")
	private Long idSumula;
	/*
  `ID_JOGO` INT(11) NOT NULL,
  `ID_ORGANIZADOR` INT(11) NOT NULL,
  `ID_EVENTO_EQUIPE` INT(11) NOT NULL*/
}

=======
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema="DBFUT", name="SUMULA")
public class Sumula implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID_SUMULA")
	private Long idSumula;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_JOGO")
	private Jogo jogo;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_ORGANIZADOR")
	private Organizador organizador;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EVENTO_EQUIPE")
	private EventoEquipe eventoEquipe;
}
>>>>>>> origin/main
