package comp.company;

import java.util.HashMap;

public class contract {
    private String date;
    private HashMap<Integer, document> document;

    public contract (String date){
        this.date = date;
        document = new HashMap<>();
    }

}