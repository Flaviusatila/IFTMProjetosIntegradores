package eVacina.evacina.repository;

import eVacina.evacina.entites.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoJpaRepository extends JpaRepository<Endereco,Long> {
}
