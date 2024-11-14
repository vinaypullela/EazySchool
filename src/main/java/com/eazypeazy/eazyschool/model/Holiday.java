package com.eazypeazy.eazyschool.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor


public class Holiday {

    private final String day;
    private final String reason;
    private final Type type;

    public enum Type{
        FESTIVAL , FEDERAL
    }

}
