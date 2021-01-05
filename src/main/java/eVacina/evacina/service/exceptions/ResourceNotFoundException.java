package eVacina.evacina.service.exceptions;

public class ResourceNotFoundException  extends RuntimeException{

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " +id);
    }
    public ResourceNotFoundException(String id){
        super(id);
    }
}
