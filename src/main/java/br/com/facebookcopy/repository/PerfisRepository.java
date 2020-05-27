package br.com.facebookcopy.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.facebookcopy.entity.Perfis;

@Repository
public interface PerfisRepository extends JpaRepository<Perfis, UUID> {

}
