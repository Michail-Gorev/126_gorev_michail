package comp.company;

public class document {
    private int sum;
    private DocumentType type;
    private String date;

    public document(int sum, DocumentType type, String date) {
        this.sum = sum;
        this.type = type;
        this.date = date;
    }
    public int getSum(){
        return sum;
    }
}