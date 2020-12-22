package eVacina.evacina.repository;

import eVacina.evacina.entites.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinaJpaRepository extends JpaRepository<Vacina,Long> {
}
