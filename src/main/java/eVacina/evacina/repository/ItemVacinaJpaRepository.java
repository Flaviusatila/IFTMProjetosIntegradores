package eVacina.evacina.repository;

import eVacina.evacina.entites.ItemVacina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemVacinaJpaRepository extends JpaRepository<ItemVacina,Long> {
}
