package br.com.eventoesportivo.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema="DBFUT", name="RESENHA")
public class Resenha implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_RESENHA")
	private Long idResenha;

	@Column(name = "DT_RESENHA")
	private LocalDateTime dataResenha;
	
	@Column(name = "TXT_RESENHA")
	private String txtResenha;
	
	@Column(name = "DT_EXCLUSAO_RESENHA")
	private String dataExclusaoResenha;
	
	public boolean naoExcluido()
	{
		return dataExclusaoResenha.toString().isEmpty();
	}
}