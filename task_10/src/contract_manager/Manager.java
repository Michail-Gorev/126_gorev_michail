package contract_manager;

import java.util.HashMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Manager {
    private static HashMap<String, Document> documents;

    private Manager(){
        documents = new HashMap<>();
    }
    public static Manager create(){
        return new Manager();
    }


    public static HashMap<String, Integer> getAllDocumentsWithPays() {
        HashMap<String,Integer> documentsWithPays = new HashMap();
        for (Map.Entry<String,Document> entry: documents.entrySet()){
            documentsWithPays.put(entry.getKey(), entry.getValue().getSumOfDocuments());
        }

        return documentsWithPays;
    }

    public int getDocumentsNumber() {
        return documents.size();
    }
    public void addDocument(String number, String date){
        documents.put(number, new Document(date));
    }
    public HashMap<String, Document> getDocuments(){
        return documents;
    }
    public void registerDocument(int sum, int documentNumber, DocTypes docTypes, String documentNum, String date) {
        documents.get(documentNum).registerDocument(sum,documentNumber,docTypes,date);
    }
    public static List<Integer> getAllDocuments() {
        List<Integer>  DOCUMENTS = new ArrayList();
        for(Document contract : documents.values()){
            for(PaymentDocument paymentDoc : contract.getPaymentDocuments().values())
                DOCUMENTS.add(paymentDoc.getSum());
        }

        return DOCUMENTS;
    }
    public void deleteDocument(int DocumentNum, String contractNum, String Date) {
        documents.get(contractNum).getPaymentDocuments().remove(DocumentNum);
    }
}

