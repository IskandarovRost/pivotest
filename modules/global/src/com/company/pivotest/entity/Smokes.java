package com.company.pivotest.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Smokes implements EnumClass<Integer> {

    YES(10),
    NO(20);

    private Integer id;

    Smokes(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static Smokes fromId(Integer id) {
        for (Smokes at : Smokes.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}