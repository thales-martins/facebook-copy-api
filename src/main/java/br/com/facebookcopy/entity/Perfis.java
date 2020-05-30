package br.com.facebookcopy.entity;

import java.sql.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "perfis")
public class Perfis {
	
	@Id
	@Getter
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;
	
	@Setter
	@Getter
	@Column(name = "tx_nome")
	private String nome;
	
	@Setter
	@Getter
	@Column(name = "tx_sobrenome")
	private String sobrenome;
	
	@Setter
	@Getter
	@Column(name = "tx_foto_perfil")
	private String fotoPerfil;
	
	@Setter
	@Getter
	@Column(name = "tx_foto_capa")
	private String fotoCapa;
	
	@Setter
	@Getter
	@Column(name = "dt_registro")
	private Date dataRegistro;
	
	@Setter
	@Getter
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "id_perfil")
	private List<LocaisTrabalho> locaisTrabalho;
}
