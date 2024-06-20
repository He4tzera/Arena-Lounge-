package com.api.arenalounge.cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface clienteRepository extends JpaRepository<cliente, Long> {
}
