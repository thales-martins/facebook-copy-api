package br.com.facebookcopy.entity;

import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "locais_trabalho")
public class LocaisTrabalho {
	
	@Id
	@Getter
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;
	
	@Getter
	@Setter
	@Column(name = "tx_empresa")
	private String empresa;

	@Getter
	@Setter
	@Column(name = "tx_cargo")
	private String cargo;
	
	@Getter
	@Setter
	@Column(name = "tx_cidade")
	private String cidade;
	
	@Getter
	@Setter
	@Column(name = "tx_descricao")
	private String descricao;
	
	@Getter
	@Setter
	@Column(name = "dt_inicio")
	private Date dataInicio;
	
	@Getter
	@Setter
	@Column(name = "dt_termino")
	private Date dataTermino;
	
	@Getter
	@Setter
	@Column(name = "bl_trabalho_atual")
	private Boolean trabalhoAtual;
	
	@Getter
	@Setter
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_perfil")
	private Perfis perfil;
	
	@Getter
	@Setter
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_privacidade")
	private NiveisPrivacidade privacidade;
}
