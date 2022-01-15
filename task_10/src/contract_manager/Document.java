package contract_manager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Document {
    private String date;

    private HashMap<Integer, PaymentDocument> paymentDocuments;
    private int sumOfDocuments;
    public Document(String date){
        this.date = date;
        paymentDocuments = new HashMap<>();
        sumOfDocuments = 0;
    }
    public int getDocumentsNumber(){
        return paymentDocuments.size();
    }
    public void registerDocument(int sum, int number, DocTypes docTypes, String date){
        paymentDocuments.put(number, new PaymentDocument(sum,  docTypes, date));
        sumOfDocuments += sum;
    }
    public int getSumOfDocuments(){
        return sumOfDocuments;
    }
    public HashMap<Integer, PaymentDocument> getPaymentDocuments(){
        return paymentDocuments;
    }

    public List<Integer> getListOfDocuments() {
        List<Integer> DOCUMENTS = new ArrayList();
        for(PaymentDocument Doc : paymentDocuments.values()){
            DOCUMENTS.add(Doc.getSum());
        }

        return DOCUMENTS;
    }
}
