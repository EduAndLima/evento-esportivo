package br.com.eventoesportivo.entity;

<<<<<<< HEAD
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="DBFUT", name="ORGANIZADOR")
public class Organizador {
    @Id
	@Column(name = "ID_ORGANIZADOR")
	private Long idOrganizador;
	/*
  `NOME_ORGANIZADOR` VARCHAR(60) NOT NULL,
  `ID_TIPO_ORGANIZADOR` INT(11) NOT NULL,
  `DT_INCLUSAO_ORGANIZADOR` DATE NOT NULL,
  `DT_EXCLUSAO_ORGANIZADO` DATE DEFAULT NULL,
  `EMAIL_ORGANIZADOR` VARCHAR(100) DEFAULT NULL,
  `TELEFONE_ORGANIZADOR` VARCHAR(30) DEFAULT NULL*/
}
=======
import java.io.Serializable;
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
@Table(schema="DBFUT", name="ORGANIZADOR")
public class Organizador implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_ORGANIZADOR")
	private Long idOrganizador;

	@Column(name = "NOME_ORGANIZADOR")
	private String nomeOrganizador;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TIPO_ORGANIZADOR")
	private TipoOrganizador tipoOrganizador;
	
	@Column(name = "DT_INCLUSAO_ORGANIZADOR")
	private LocalDateTime dataCriacaoOrganizador;
	
	@Column(name = "DT_EXCLUSAO_ORGANIZADOR")
	private LocalDateTime dataExclusaoOrganizador;
	
	@Column(name = "EMAIL_ORGANIZADOR")
	private String emailOrganizador;
	
	@Column(name = "TELEFONE_ORGANIZADOR")
	private String telefoneOrganizador;
	
	public boolean naoExcluido()
	{
	return dataExclusaoOrganizador.toString().isEmpty();
	}
}
>>>>>>> origin/main
