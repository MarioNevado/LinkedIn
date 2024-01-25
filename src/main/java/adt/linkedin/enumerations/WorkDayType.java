package adt.linkedin.enumerations;

public enum WorkDayType {
    INTERSHIP(0), FULL_TIME(1), CONTRACT(2), PART_TIME(3), TEMPORARY(4);
    private int code;
    private WorkDayType(int code) {
        this.code = code;
    }
    public WorkDayType valOf(String name){
        for (WorkDayType type : values()){
            if (type.name().equals(name)){
                return type;
            }
        }
        return null;
    }
}
