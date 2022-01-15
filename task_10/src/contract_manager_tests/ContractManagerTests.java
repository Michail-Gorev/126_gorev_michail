package contract_manager_tests;

import contract_manager.Documents;
import org.junit.*;

public class ContractManagerTests extends Assert {

    @Test
    public void create_CreateListOfDocuments_DocumentsNumberEqualsZero() {
        Documents document = Documents.create();
        assertEquals(0,document.getDocumentsNumber());
    }
    @Test
    public void addDocument_AddDocumentWithNumberAndDate_DocumentsNumberEqualsOne() {
        Documents document = Documents.create();
        document.addDocument("1", "20200101");
        assertEquals(1, document.getDocumentsNumber);
    }
}
