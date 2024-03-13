package br.com.eventoesportivo.entity;

<<<<<<< HEAD
=======
import java.io.Serializable;
import static java.util.Objects.nonNull;
import java.time.LocalDateTime;

>>>>>>> origin/main
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

<<<<<<< HEAD
@Entity
@Table(schema="DBFUT", name="USUARIO")
public class Usuario {
    @Id
	@Column(name = "ID_USUARIO")
	private Long idUsuario;
	/*
  `NOME_USUARIO` VARCHAR(100) NOT NULL,
  `DT_CRIACAO_USUARIO` DATETIME NOT NULL,
  `DT_EXCLUSAO_USUARIO` DATETIME DEFAULT NULL,
  `EMAIL_USUARIO` VARCHAR(100) NOT NULL,
  `SENHA_USUARIO` VARCHAR(32) NOT NULL*/
  }
=======
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
>>>>>>> origin/main
