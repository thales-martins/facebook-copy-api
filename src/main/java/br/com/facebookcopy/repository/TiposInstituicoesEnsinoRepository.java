package br.com.facebookcopy.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.facebookcopy.entity.TiposInstituicoesEnsino;

@Repository
public interface TiposInstituicoesEnsinoRepository extends JpaRepository<TiposInstituicoesEnsino, UUID> {

}
