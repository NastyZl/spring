package org.example.data.enums;

public enum Mark {
    EXCELLENT(5),
    GOOD(4),
    SATISFACTORY(3),
    FAIL(2),
    ;
    private int value;

    Mark(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
