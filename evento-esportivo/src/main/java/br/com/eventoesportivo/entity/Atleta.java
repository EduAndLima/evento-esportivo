package br.com.eventoesportivo.entity;

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


@Entity
@Table(schema="DBFUT", name="ATLETA")
public class Atleta {
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
}