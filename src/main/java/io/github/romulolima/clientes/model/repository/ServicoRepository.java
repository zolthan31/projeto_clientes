package io.github.romulolima.clientes.model.repository;

import io.github.romulolima.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
