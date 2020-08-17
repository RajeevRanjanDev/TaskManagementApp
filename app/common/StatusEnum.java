package common;

public enum StatusEnum {
    OPEN("OPEN"),
    CLOSED("CLOSED"),
    IN_PROGRESS("IN_PROGRESS"),
    IN_REVIEW("IN_REVIEW"),
    ERROR("ERROR");

    private String type;

    StatusEnum(String type) {
        this.type = type;
    }

    public String getStautsType() {
        return type;
    }
}

