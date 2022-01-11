package comp.company;

import java.util.HashMap;

public class manager {

    private HashMap<Integer, com.company.contract> contracts;

    private manager(){
        contracts = new HashMap<>();
    }

    public static manager create() {
        return new manager();
    }

    public int getContractsCount() {
        return contracts.size();
    }

    public void addContract(String number, String date) {
        contracts.put(Integer.parseInt(number),new com.company.contract(date));
    }
}