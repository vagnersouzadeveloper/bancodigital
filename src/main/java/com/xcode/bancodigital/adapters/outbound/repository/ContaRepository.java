package com.xcode.bancodigital.adapters.outbound.repository;

import com.xcode.bancodigital.adapters.outbound.entity.ContaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContaRepository extends JpaRepository<ContaEntity, Long> {
    Optional<ContaEntity> findByCpf(String cpf);
}
