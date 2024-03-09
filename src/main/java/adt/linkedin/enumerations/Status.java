package adt.linkedin.enumerations;

public enum Status {
    REJECTED(0), PENDING(1), ACCEPTED(2);
    private int value;
    
    private Status(int value){
        if (value != 0 && value != 1 && value != 2) {
            this.value = 0;
        }else this.value = value;
    }
    
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
