package contract_manager;

import java.util.HashMap;
public class Manager {
    private HashMap<Integer, Document> documents;

    private Manager(){
        documents = new HashMap<>();
    }
    public static Manager create(){
        return new Manager();
    }
    public int getDocumentsNumber() {
        return documents.size();
    }
    public void addDocument(String number, String date){
        documents.put(Integer.parseInt(number), new Document(date));
    }
}
