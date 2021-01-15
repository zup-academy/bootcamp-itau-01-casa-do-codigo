package br.com.zup.casadocodigo.autores;

import org.springframework.data.jpa.repository.JpaRepository;

// Domain driven Design -> DDD
public interface AutorRepository extends JpaRepository<Autor, Long> {
}
