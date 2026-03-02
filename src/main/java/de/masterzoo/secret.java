package de.masterzoo;

import java.time.LocalDate;
import java.time.Month;

public enum secret {
    firstDayOfBilling(LocalDate.of(2025, Month.JANUARY, 31));
    private final LocalDate value;

    secret(LocalDate value) {
        this.value = value;
    }

    public LocalDate getValue() {
        return value;
    }
}
