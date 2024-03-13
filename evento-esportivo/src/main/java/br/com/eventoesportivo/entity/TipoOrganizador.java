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
@Table(schema="DBFUT", name="TIPO_ORGANIZADOR")
public class TipoOrganizador {
    @Id
	@Column(name = "ID_TIPO_ORGANIZADOR")
	private Long idTipoOrganizador;
	/*
  `DESC_TIPO_ORGANIZADOR` VARCHAR(50) NOT NULL,
  `DT_INCLUSAO_TIPO_ORGANIZADOR` DATE NOT NULL,
  `DT_EXCLUSAO_TIPO_ORGANIZADOR` DATE DEFAULT NULL*/
    }
=======
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(schema="DBFUT", name="TIPO_ORGANIZADOR")
public class TipoOrganizador implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID_TIPO_ORGANIZADOR")
	private Long idTipoOrganizador;

	@Column(name = "DESC_TIPO_ORGANIZADOR")
	private String descTipoOrganizador;

	@Column(name = "DT_INCLUSAO_TIPO_ORGANIZADOR")
	private LocalDateTime dataInclusaoTipoOrganizador;
	
	@Column(name = "DT_EXCLUSAO_TIPO_ORGANIZADOR")
	private LocalDateTime dataExclusaoTipoOrganizador;
	
	public boolean naoExcluido()
	{
		return dataExclusaoTipoOrganizador.toString().isEmpty();
	}
}
>>>>>>> origin/main
