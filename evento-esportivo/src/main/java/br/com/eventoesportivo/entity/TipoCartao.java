package br.com.eventoesportivo.entity;

<<<<<<< HEAD
=======
import java.io.Serializable;
import java.time.LocalDateTime;

>>>>>>> origin/main
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

<<<<<<< HEAD
@Entity
@Table(schema="DBFUT", name="TIPO_CARTAO")
public class TipoCartao {
    @Id
	@Column(name = "ID_TIPO_CARTAO")
	private Long idTipoCartao;
	/*
  `DESC_TIPO_CARTAO` VARCHAR(50) NOT NULL,
  `DT_INCLUSAO_TIPO_CARTAO` DATE NOT NULL,
  `DT_EXCLUSAO_TIPO_CARTAO` DATE DEFAULT NULL*/
    }
=======
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema="DBFUT", name="TIPO_CARTAO")
public class TipoCartao implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_TIPO_CARTAO")
	private Long idTipoCartao;

	@Column(name = "DESC_TIPO_CARTAO")
	private String descTipoCartao;

	@Column(name = "DT_INCLUSAO_TIPO_CARTAO")
	private LocalDateTime dataInclusaoTipoCartao;
	
	@Column(name = "DT_EXCLUSAO_TIPO_CARTAO")
	private LocalDateTime dataExclusaoTipoCartao;
	
	public boolean naoExcluido()
	{
		return dataExclusaoTipoCartao.toString().isEmpty();
	}
}
>>>>>>> origin/main
