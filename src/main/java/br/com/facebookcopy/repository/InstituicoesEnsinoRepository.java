package br.com.facebookcopy.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.facebookcopy.entity.InstituicoesEnsino;

@Repository
public interface InstituicoesEnsinoRepository extends JpaRepository<InstituicoesEnsino, UUID> {

}
