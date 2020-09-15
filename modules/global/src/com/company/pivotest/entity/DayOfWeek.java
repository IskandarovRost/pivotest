package com.company.pivotest.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum DayOfWeek implements EnumClass<String> {

    SUNDAY("A"),
    MONDAY("B"),
    TUESDAY("C"),
    WEDNESDAY("D"),
    THURSDAY("E"),
    FRIDAY("F"),
    SATURDAY("G");

    private String id;

    DayOfWeek(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static DayOfWeek fromId(String id) {
        for (DayOfWeek at : DayOfWeek.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}