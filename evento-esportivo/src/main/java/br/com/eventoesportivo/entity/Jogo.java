package br.com.eventoesportivo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

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

	//mapear equipe 1
	//mapear equipe 2
	
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
	
	// mapear evento_equipe
}