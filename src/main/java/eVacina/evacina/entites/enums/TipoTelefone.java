package eVacina.evacina.entites.enums;

public enum TipoTelefone {

    CELULAR(1),
    TELEFONE(2);

    private int code;

    private TipoTelefone(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static TipoTelefone valueOf(int code){
        for (TipoTelefone value : TipoTelefone.values() ){
            if (value.getCode() == code){
                return value;
            }
        }
        throw  new IllegalArgumentException("Invalid OrdemStatus code");
    }
    
}
