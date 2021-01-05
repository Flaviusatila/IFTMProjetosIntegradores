package eVacina.evacina.service.validations;


import eVacina.evacina.controller.exceptions.FieldMessage;
import eVacina.evacina.dtos.CadastrarPacienteDTO;
import eVacina.evacina.entites.Paciente;
import eVacina.evacina.repository.PacienteJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class CadastraPacienteValidator implements ConstraintValidator<CadastraPacienteValid, CadastrarPacienteDTO> {

    @Autowired
    private PacienteJpaRepository pacienteRepository;

    @Override
    public void initialize(CadastraPacienteValid ann) {
    }

    @Override
    public boolean isValid(CadastrarPacienteDTO dto, ConstraintValidatorContext context) {
        List<FieldMessage> list = new ArrayList<>();

        Paciente user = pacienteRepository.findByCpfAndNome(dto.getCpf(),dto.getNome());

        if (user != null){
            list.add( new FieldMessage("Cpf E Nome","Já existem") );
        }

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate( e.getMessage() ).addPropertyNode( e.getFieldMessage() )
                    .addConstraintViolation();
        }
        return list.isEmpty();
    }
}