package br.com.eventoesportivo.entity;



import static java.util.Objects.nonNull;

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
@Table(schema="DBFUT", name="USUARIO")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_USUARIO")
	private Long idUsuario;

	@Column(name = "NOME_USUARIO")
	private String nomeUsuario;

	@Column(name = "DT_CRIACAO_USUARIO")
	private LocalDateTime dataCriacaoUsuario;
	
	@Column(name = "DT_EXCLUSAO_USUARIO")
	private LocalDateTime dataExclusaoUsuario;
	
	@Column(name = "EMAIL_USUARIO")
	private String emailUsuario;
	
	@Column(name = "SENHA_USUARIO")
	private String senhaUsuario;
	
	public boolean excluido()
	{
		return nonNull(dataExclusaoUsuario);
	}
}

