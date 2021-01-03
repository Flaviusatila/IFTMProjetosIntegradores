package eVacina.evacina.repository;

import eVacina.evacina.entites.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteJpaRepository extends JpaRepository<Paciente,Long> {

//    @Query(value ="SELECT * FROM [TB_PACIENTE] WHERE CPF = ?1" ,nativeQuery = true)
    long countByCpf(String cpf);

}
