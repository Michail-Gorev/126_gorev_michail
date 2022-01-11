package comp.company;

import java.util.HashMap;

public class manager {

    private HashMap<Integer, contract> contracts;

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
        contracts.put(Integer.parseInt(number),new contract(date));
    }
    public HashMap<Integer,contract> getContracts() {
        return contracts;
    }
}