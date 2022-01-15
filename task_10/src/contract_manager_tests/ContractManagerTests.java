package contract_manager_tests;

import contract_manager.Documents;
import org.junit.*;

public class ContractManagerTests extends Assert {

    @Test
    public void create_CreateListOfDocuments_DocumentsNumberEqualsZero() {
        Documents document = Documents.create();
        assertEquals(0,document.getDocumentNumber());
    }
}
