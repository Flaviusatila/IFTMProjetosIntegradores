package eVacina.evacina.repository;

import eVacina.evacina.entites.CartaoVacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CartaoVacinaJpaRepository extends JpaRepository<CartaoVacina,Long> {
}
