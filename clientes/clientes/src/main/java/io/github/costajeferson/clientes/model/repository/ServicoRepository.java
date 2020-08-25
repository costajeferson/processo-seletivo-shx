package io.github.costajeferson.clientes.model.repository;

import io.github.costajeferson.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository  extends JpaRepository <Servico, Integer> {
}
