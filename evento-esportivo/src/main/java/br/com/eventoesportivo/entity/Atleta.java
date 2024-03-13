package br.com.eventoesportivo.entity;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="ATLETA")
public class Atleta{
	@Id
	@Column(name = "ID_ATLETA")
	private Long idAtleta;
	/*
  `NOME_ATLETA` VARCHAR(100) NOT NULL,
  `DT_NASCIMENTO_ATLETA` DATE NOT NULL,
  `DT_INCLUSAO_ATLETA` DATE NOT NULL,
  `DT_EXCLUSAO_ATLETA` DATE DEFAULT NULL,
  `EMAIL_ATLETA` VARCHAR(100) DEFAULT NULL,
  `TELEFONE_ATLETA` VARCHAR(20) DEFAULT NULL,
  `ID_TIPO_VINCULO` INT(11) NOT NULL*/
  }
=======
import java.io.Serializable;
import java.sql.Blob;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
@Table(schema="DBFUT", name="ATLETA")
public class Atleta implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_ATLETA")
	private Long idAtleta;

	@Column(name = "NOME_ATLETA")
	private String nomeAtleta;
	
	@Column(name = "DT_NASCIMENTO_ATLETA")
	private LocalDate dataNascimentoAtleta;

	@Column(name = "DT_INCLUSAO_ATLETA")
	private LocalDateTime dataInclusaoAtleta;
	
	@Column(name = "DT_EXCLUSAO_ATLETA")
	private LocalDateTime dataExclusaoAtleta;
	
	@Column(name = "EMAIL_ATLETA")
	private String emailAtleta;
	
	@Column(name = "TELEFONE_ATLETA")
	private String telefoneAtleta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_VINCULO")
	private TipoVinculo tipoVinculo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_POSICAO")
	private Posicao posicao;
	
	@Column(name = "DOCUMENTO_ATLETA")
	private String documentoAtleta;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_DOCUMENTO")
	private TipoDocumento tipoDocumento;
	
	@Column(name = "FOTO_ATLETA")
	private Blob fotoAtleta;
	
	public boolean naoExcluido()
	{
	return dataExclusaoAtleta.toString().isEmpty();
	}
}
>>>>>>> origin/main
