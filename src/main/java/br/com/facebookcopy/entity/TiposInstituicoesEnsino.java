package br.com.facebookcopy.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tipos_instituicoes_ensino")
public class TiposInstituicoesEnsino {
	
	@Id
	@Getter
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUID.Generator")
	private UUID id;
	
	@Getter
	@Column(name = "tx_tipo")
	private String tipo;
}
