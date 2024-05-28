package br.com.dcmacedo.literalura.repositories;

import br.com.dcmacedo.literalura.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
