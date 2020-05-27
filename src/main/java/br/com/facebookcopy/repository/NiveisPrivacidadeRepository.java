package br.com.facebookcopy.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.facebookcopy.entity.NiveisPrivacidade;

@Repository
public interface NiveisPrivacidadeRepository extends JpaRepository<NiveisPrivacidade, UUID> {

}
