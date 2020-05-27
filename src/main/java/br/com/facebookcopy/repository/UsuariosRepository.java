package br.com.facebookcopy.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.facebookcopy.entity.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, UUID> {
	
	Usuarios findByEmail(String email);
}
