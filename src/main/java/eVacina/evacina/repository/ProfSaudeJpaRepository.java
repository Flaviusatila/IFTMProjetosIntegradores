package eVacina.evacina.repository;

import eVacina.evacina.entites.ProfSaude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfSaudeJpaRepository extends JpaRepository<ProfSaude,Long> {
    Optional<ProfSaude> findByUsuario(String usuario);
}
