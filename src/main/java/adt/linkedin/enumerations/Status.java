package adt.linkedin.enumerations;

public enum Status {
    REJECTED(0), PENDING(1), ACCEPTED(2);
    private final int value;
    
    private Status(int value){
        if (value != 0 && value != 1 && value != 2) {
            this.value = 0;
        }else this.value = value;
    }
    
    /**
     * Obtiene estado en función del nombre
     * @param name nombre del estado
     * @return devuelve un estado si el nombre de alguno de ellos equivale al pasado por parámetro
     */
    public Status valOf(String name){
        for (Status status : values()){
            if (status.name().equals(name)){
                return status;
            }
        }
        return null;
    }
    
    public int getValue() {
        return value;
    }
    
    @Override
    public String toString() {
        switch (value) {
            case 0:
                return "Rejected";
            case 1:
                return "Pending";
            default:
                return "Accepted";
        }
    }
    
    
}
