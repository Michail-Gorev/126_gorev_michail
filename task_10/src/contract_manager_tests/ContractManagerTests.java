package contract_manager_tests;

import contract_manager.Document;
import contract_manager.Manager;
import org.junit.*;

public class ContractManagerTests extends Assert {

    @Test
    public void create_CreateListOfDocuments_DocumentsNumberEqualsZero() {
        Manager document = Manager.create();
        assertEquals(0,document.getDocumentsNumber());
    }
    @Test
    public void addDocument_AddDocumentWithNumberAndDate_DocumentsNumberEqualsOne() {
        Manager document = Manager.create();
        document.addDocument("1", "20200101");
        assertEquals(1, document.getDocumentsNumber());
    }
}
