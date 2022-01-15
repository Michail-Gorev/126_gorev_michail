package contract_manager;

public class PaymentDocument {
    private DocTypes type;
    private String date;
    private int sum;

    public PaymentDocument(int sum, DocTypes type, String date){
        this.sum = sum;
        this.date = date;
        this.type = type;
    }
}
