package eVacina.evacina.service.validations;


import eVacina.evacina.controller.exceptions.FieldMessage;
import eVacina.evacina.dtos.AtualizaPacienteDTO;
import eVacina.evacina.entites.Paciente;
import eVacina.evacina.repository.PacienteJpaRepository;
import eVacina.evacina.service.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.ArrayList;
import java.util.List;

public class AtualizaPacienteValidator implements ConstraintValidator<AtualizaPacienteValid, AtualizaPacienteDTO> {


    @Autowired
    private PacienteJpaRepository pacienteRepository;

    @Override
    public void initialize(AtualizaPacienteValid constraintAnnotation) {
    }

    @Override
    public boolean isValid(AtualizaPacienteDTO dto, ConstraintValidatorContext context) {


        List<FieldMessage> list = new ArrayList<>();

        Paciente user = pacienteRepository.findByCpf(dto.getCpf())
                        .orElseThrow( () -> new ResourceNotFoundException( "Cpf Não Cadastrado" ) );;

        if (user != null && !user.getNome().equals( dto.getNome() )){
            list.add( new FieldMessage("Nome","Nome já existe em outro paciente") );
        }

        for (FieldMessage e : list) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate( e.getMessage() ).addPropertyNode( e.getFieldMessage() )
                    .addConstraintViolation();
        }
        return list.isEmpty();
    }
}