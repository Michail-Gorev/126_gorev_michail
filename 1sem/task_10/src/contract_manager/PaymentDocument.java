package contract_manager;

public class PaymentDocument {
    private DocTypes type;
    private String date;
    private int sum;

    public PaymentDocument(int sum, DocTypes type, String date){
        this.sum = sum;
        this.type = type;
        this.date = date;
    }
    public int getSum(){
        return sum;
    }
}
