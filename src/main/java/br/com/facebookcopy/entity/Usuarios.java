package br.com.facebookcopy.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "usuarios")
public class Usuarios {
	
	@Id
	@Getter
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
	private UUID id;
	
	@Getter
	@Setter
	@Column(name = "tx_email")
	private String email;
	
	@Getter
	@Setter
	@Column(name = "tx_senha")
	private String senha;
	
	@Setter
	@Getter
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_perfil")
	private Perfis perfil;
	
	public Usuarios(Usuarios usuario) {
		
		this.id = usuario.getId();
		
		this.email = usuario.getEmail();
		
		this.senha = usuario.getSenha();
	}
}
