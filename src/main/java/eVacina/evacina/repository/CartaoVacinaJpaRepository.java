package eVacina.evacina.repository;

import eVacina.evacina.entites.CartaoVacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartaoVacinaJpaRepository extends JpaRepository<CartaoVacina,Long> {

    Optional<CartaoVacina> findByCod(String cpf);


}
