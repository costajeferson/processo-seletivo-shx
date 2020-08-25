package io.github.costajeferson.clientes.model.repository;

import io.github.costajeferson.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente,Integer> {
}


