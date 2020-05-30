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
@Table(name = "instituicoes_ensino")
public class InstituicoesEnsino {
	
	@Id
	@Getter
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernat.id.UUIDGenerator")
	private UUID id;
	
	@Getter
	@Setter
	@Column(name = "tx_instituicao_ensino")
	private String instituicaoEnsino;
	
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
	@Column(name = "bl_formou")
	private Boolean formou;
	
	@Getter
	@Setter
	@Column(name = "tx_descricao")
	private String descricao;
	
	@Getter
	@Setter
	@Column(name = "tx_especialidade_1")
	private String especilidade1;
	
	@Getter
	@Setter
	@Column(name = "tx_especialidade_2")
	private String especilidade2;
	
	@Getter
	@Setter
	@Column(name = "tx_especialidade_3")
	private String especilidade3;
	
	@Getter
	@Setter
	@Column(name = "tx_graduacao")
	private String graduacao;
	
	@Getter
	@Setter
	@OneToOne(fetch = FetchType.EAGER)
	private TiposInstituicoesEnsino tipoInstituicaoEnsino;
	
	@Setter
	@ManyToOne
	@JoinColumn(name = "id_perfil")
	private Perfis perfil;
	
	@Getter
	@Setter
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_privacidade")
	private NiveisPrivacidade privacidade;
}
