package eVacina.evacina.repository;

import eVacina.evacina.entites.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PacienteJpaRepository extends JpaRepository<Paciente,Long> {

//    @Query(value ="SELECT * FROM [TB_PACIENTE] WHERE CPF = ?1" ,nativeQuery = true)
    long countByCpf(String cpf);

    @Override
    Optional<Paciente> findById(Long aLong);

    Optional<Paciente> findByCpf(String cpf);

    Paciente findByCpfAndNome(String cpf, String nome);
}
