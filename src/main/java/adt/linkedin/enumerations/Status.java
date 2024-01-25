package adt.linkedin.enumerations;

public enum Status {
    REJECTED(0), PENDING(1), ACCEPTED(2);
    private int value;
    private Status(int value){
        this.value = value;
    }
    public Status valOf(String name){
        for (Status status : values()){
            if (status.name().equals(name)){
                return status;
            }
        }
        return null;
    }

}
