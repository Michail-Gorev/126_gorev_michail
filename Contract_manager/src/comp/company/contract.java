package comp.company;

import java.util.HashMap;

public class contract {
    private String date;
    private HashMap<Integer, document> document;

    public contract (String date){
        this.date = date;
        document = new HashMap<>();
    }
    public int getDocumentCount() {
        return document.size();
    }
    public void registerPaymentDocument(int sum, int number, DocumentType paymentType, String date){
        document.put(number,new document(sum,paymentType,date));
    }

}