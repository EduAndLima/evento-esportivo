package br.com.eventoesportivo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(schema="DBFUT", name="RESENHA")
public class Resenha {
	@Id
	@Column(name = "ID_RESENHA")
	private Long idResenha;

	@Column(name = "DT_RESENHA")
	private LocalDateTime dataResenha;
	
	@Column(name = "TXT_RESENHA")
	private String txtResenha;
}