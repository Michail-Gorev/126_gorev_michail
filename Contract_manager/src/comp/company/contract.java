package com.company;

import java.util.HashMap;

public class contract {
    private String date;
    private HashMap<Integer, com.company.document> document;

    public contract (String date){
        this.date = date;
        document = new HashMap<>();
    }

}