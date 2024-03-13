package adt.linkedin.enumerations;

public enum WorkDayType {
    INTERNSHIP(0), FULL_TIME(1), CONTRACT(2), PART_TIME(3), TEMPORARY(4);
    private final int code;
    private WorkDayType(int code) {
        this.code = code;
    }
    
    /**
     * Obtiene tipo de jornada en función del nombre
     * @param name nombre del tipo de jornada
     * @return devuelve un tipo de jornada si el nombre de alguno de ellos equivale al pasado por parámetro
     */
    public WorkDayType valOf(String name){
        for (WorkDayType type : values()){
            if (type.name().equals(name)){
                return type;
            }
        }
        return null;
    }
    
    /**
     * Obtiene tipo de jornada en función del índice
     * @param index nombre del tipo de jornada
     * @return devuelve un tipo de jornada de la lista de valores
     */
    public WorkDayType getType(int index){
        return values()[index];
    }
    
    public int getValue() {
        return code;
    }
}
