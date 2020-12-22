package eVacina.evacina.repository;

import eVacina.evacina.entites.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface PacienteJpaRepository extends JpaRepository<Paciente,Long> {
}
