package eVacina.evacina.repository;

import eVacina.evacina.entites.ProfSaude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfSaudeJpaRepository extends JpaRepository<ProfSaude,Long> {
}
