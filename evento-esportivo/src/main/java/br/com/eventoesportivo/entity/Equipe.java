package br.com.eventoesportivo.entity;

<<<<<<< HEAD
=======
import java.io.Serializable;
import java.sql.Blob;
>>>>>>> origin/main
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

<<<<<<< HEAD

@Entity
@Table(schema="DBFUT", name="EQUIPE")
public class Equipe {
=======
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema="DBFUT", name="EQUIPE")
public class Equipe implements Serializable {

	private static final long serialVersionUID = 1L;
>>>>>>> origin/main
	@Id
	@Column(name = "ID_EQUIPE")
	private Long idEquipe;

	@Column(name = "NOME_EQUIPE")
	private String nomeEquipe;

	@Column(name = "DT_CRIACAO_EQUIPE")
	private LocalDateTime dataCriacaoEquipe;
	
	@Column(name = "DT_EXCLUSAO_EQUIPE")
	private LocalDateTime dataExclusaoEquipe;
<<<<<<< HEAD
=======
	
	@Column(name = "ESCUDO_EQUIPE")
	private Blob escudoEquipe;
	
	@Column(name = "FOTO_EQUIPE")
	private Blob fotoEquipe;
	
	public boolean naoExcluido()
	{
	return dataExclusaoEquipe.toString().isEmpty();
	}
>>>>>>> origin/main
}