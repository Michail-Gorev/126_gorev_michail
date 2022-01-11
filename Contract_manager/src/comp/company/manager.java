package comp.company;

import java.util.HashMap;

public class manager {

    private HashMap<String, contract> contracts;

    private manager() {
        contracts = new HashMap<>();
    }

    public static manager create() {
        return new manager();
    }

    public int getContractsCount() {
        return contracts.size();
    }

    public void addContract(String number, String date) {
        contracts.put(number, new contract(date));
    }

    public HashMap<String, contract> getContracts() {
        {
            return contracts;
        }
    }
}