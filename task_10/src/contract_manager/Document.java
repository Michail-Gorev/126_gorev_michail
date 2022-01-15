package contract_manager;
import java.util.HashMap;

public class Document {
    private String date;

    private HashMap<Integer, PaymentDocument> paymentDocuments;

    public Document(String date){
        this.date = date;
        paymentDocuments = new HashMap<>();
    }
}
