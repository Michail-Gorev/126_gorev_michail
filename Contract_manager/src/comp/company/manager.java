package comp.company;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

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
    public void registerPaymentDocument(int sum, int paymentDocumentNumber, DocumentType paymentType,
                                        String contractNumber, String date) {
        contracts.get(contractNumber).registerPaymentDocument(sum,paymentDocumentNumber,paymentType,date);
    }
    public List<Integer> getAll() {
        List<Integer> payments = new ArrayList();
        for(contract contract : contracts.values()){
            for(document paymentDoc : contract.getDocument().values())
                payments.add(paymentDoc.getSum());
        }

        return payments;
    }
}