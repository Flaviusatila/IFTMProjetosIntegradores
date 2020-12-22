package eVacina.evacina.repository;

import eVacina.evacina.entites.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultaJpaRepository  extends JpaRepository<Consulta,Long> {
}
