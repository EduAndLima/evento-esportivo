package br.com.eventoesportivo.entity;


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

