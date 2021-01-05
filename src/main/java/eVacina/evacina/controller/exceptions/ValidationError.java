package eVacina.evacina.controller.exceptions;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandarError {


    private List<FieldMessage> erros = new ArrayList<>();

    public ValidationError(){

    }

    public ValidationError(Instant timestamp, Integer status, String error, String message, String path){
        super(timestamp,status,error,message,path);
    }

    public List<FieldMessage> getErros() {
        return erros;
    }

    public void addError(String fieldName, String message){
        erros.add( new FieldMessage(fieldName,message) );
    }
}
