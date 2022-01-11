package comp.company;

import java.util.HashMap;

public class contract {
    private String date;
    private HashMap<Integer, document> document;
    private int sumOfPayments;

    public contract (String date){
        this.date = date;
        document = new HashMap<>();
        sumOfPayments = 0;
    }

    public void registerPaymentDocument(int sum, int number, DocumentType paymentType, String date){
        document.put(number,new document(sum,paymentType,date));
        sumOfPayments += sum;
    }
    public int getDocumentCount() {
        return document.size();
    }
    public int getSumOfPayments() {
        return sumOfPayments;
    }

}