package comp.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class contract {
    private String date;
    private HashMap<Integer, document> paymentDocuments;

    public contract(String date){
        this.date = date;
        paymentDocuments = new HashMap<>();
    }

    public void registerPaymentDocument(int sum, int number, DocumentType paymentType, String date){
        paymentDocuments.put(number,new document(sum,paymentType,date));
    }

    public int getDocumentCount() {
        return paymentDocuments.size();
    }

    public HashMap<Integer, document> getPaymentDocuments(){
        return paymentDocuments;
    }

    public int getSumOfPayments() {
        int sum = 0;
        for(document doc : paymentDocuments.values()){
            sum += doc.getSum();
        }
        return sum;
    }

    public List<Integer> getListOfDocs() {
        List<Integer> payments = new ArrayList();
        for(document paymentDoc : paymentDocuments.values()){
            payments.add(paymentDoc.getSum());
        }

        return payments;
    }
}