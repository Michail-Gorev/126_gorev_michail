package contract_manager;

import java.util.HashMap;
public class Manager {
    private HashMap<String, Document> documents;

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
        documents.put(number, new Document(date));
    }
    public HashMap<String, Document> getDocuments(){
        return documents;
    }
}
