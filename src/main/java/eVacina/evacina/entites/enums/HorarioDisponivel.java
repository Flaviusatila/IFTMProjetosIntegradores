package eVacina.evacina.entites.enums;

public enum HorarioDisponivel {

    DISPONIVEL(0),
    INDISPONIVEL(1);

    private int code;

    private HorarioDisponivel(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static HorarioDisponivel valueOf(int code){
        for (HorarioDisponivel value : HorarioDisponivel.values() ){
            if (value.getCode() == code){
                return value;
            }
        }
        throw  new IllegalArgumentException("Invalid OrdemStatus code");
    }

}
