package br.com.eventoesportivo.entity;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="JOGO")
public class Jogo {
    @Id
	@Column(name = "ID_JOGO")
	private Long idJogo;
	/*
  `ID_EQUIPE_1` INT(11) NOT NULL,
  `ID_EQUIPE_2` INT(11) NOT NULL,
  `PLACAR_EQUIPE_1` INT(11) DEFAULT NULL,
  `PLACAR_EQUIPE_2` INT(11) DEFAULT NULL,
  `DT_JOGO` DATE NOT NULL,
  `HR_JOGO` TIME NOT NULL,
  `ID_EVENTO_EQUIPE` INT(11) NOT NULL
  `DT_INCLUSAO_JOGO` DATE NOT NULL,*/
}
=======
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema="DBFUT", name="JOGO")
public class Jogo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_JOGO")
	private Long idJogo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EQUIPE")
	private Equipe equipe1;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EQUIPE")
	private Equipe equipe2;
	
	@Column(name = "PLACAR_EQUIPE_1")
	private LocalDate placarEquipe1;

	@Column(name = "PLACAR_EQUIPE_2")
	private LocalDateTime placarEquipe2;
	
	@Column(name = "DT_JOGO")
	private LocalDateTime dataJogo;
	
	@Column(name = "HR_JOGO")
	private LocalTime horaJogo;
	
	@Column(name = "DT_INCLUSAO_JOGO")
	private LocalDateTime dataInclusaoJogo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EVENTO_EQUIPE")
	private EventoEquipe eventoEquipe;
}
>>>>>>> origin/main
