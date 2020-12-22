package eVacina.evacina.repository;

import eVacina.evacina.entites.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneJpaRepository extends JpaRepository<Telefone,Long> {
}
