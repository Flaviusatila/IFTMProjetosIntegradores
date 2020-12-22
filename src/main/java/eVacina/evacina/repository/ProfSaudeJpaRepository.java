package eVacina.evacina.repository;

import eVacina.evacina.entites.ProfSaude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProfSaudeJpaRepository extends JpaRepository<ProfSaude,Long> {
}
