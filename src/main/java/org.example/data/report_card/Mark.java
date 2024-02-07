package org.example.data.report_card;

public enum Mark {
    EXCELLENT(5d),
    GOOD(4d),
    SATISFACTORY(3d),
    FAIL(2d),
    ;
    private Double value;
    Mark (Double value){
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}
