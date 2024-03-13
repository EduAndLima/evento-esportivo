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
@Table(schema="DBFUT", name="PERFIL")
public class Perfil implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_PERFIL")
	private Long idPerfil;

	@Column(name = "NOME_PERFIL")
	private String nomePerfil;

	@Column(name = "DT_CRIACAO_PERFIL")
	private LocalDateTime dataCriacaoPerfil;
	
	@Column(name = "DT_EXCLUSAO_PERFIL")
	private LocalDateTime dataExclusaoPerfil;
	
	public boolean naoExcluido()
	{
	return dataExclusaoPerfil.toString().isEmpty();
	}
}

