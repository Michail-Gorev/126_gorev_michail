package contract_manager;
import java.util.HashMap;

public class Document {
    private String date;

    private HashMap<Integer, PaymentDocument> paymentDocuments;

    public Document(String date){
        this.date = date;
        paymentDocuments = new HashMap<>();
    }
    public int getDocumentsNumber(){
        return paymentDocuments.size();
    }
    public void registerDocument(int sum, int number, DocTypes docTypes, String date){
        paymentDocuments.put(number, new PaymentDocument(sum, docTypes, date));
    }
}
