package contract_manager_tests;


import contract_manager.Manager;
import org.junit.*;

import static contract_manager.DocTypes.*;

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
    @Test
    public void addDocument_AddDocumentWithNumberAndDate_DocumentsNumberEqualsFour() {
        Manager document = Manager.create();
        document.addDocument("1", "20200101");
        document.addDocument("2", "20200101");
        document.addDocument("3", "20200101");
        document.addDocument("4", "20200101");
        assertEquals(4, document.getDocumentsNumber());
    }
    @Test
    public void addDocument_AddDocumentWithFixedNumberAndDate_DocumentsNumberEqualsZero(){
        Manager document = Manager.create();
        document.addDocument("1","20200101");
        assertEquals(0,document.getDocuments().get("1").getDocumentsNumber());
    }
    @Test
    public void registerDocument_RegisterDocumentWithNumberAndDate_DocumentsNumberEqualsOne(){
        Manager document = Manager.create();
        document.addDocument("1","20200101");
        document.registerDocument(1,100, order, "1","20200101");
        assertEquals(1,document.getDocuments().get("1").getDocumentsNumber());
    }
    @Test
    public void registerDocument_RegisterDocumentWithNumberAndDate_DocumentsNumberEqualsFour(){
        Manager document = Manager.create();
        document.addDocument("1","20200101");
        document.registerDocument(100,1, order, "1","20200101");
        document.registerDocument(200,2, bankdoc, "1","20200101");
        document.registerDocument(300,3, order, "1","20200101");
        document.registerDocument(400,4, bankdoc, "1","20200101");
        assertEquals(4,document.getDocuments().get("1").getDocumentsNumber());
    }
    @Test
    public void calculationOfSum_CalculationSumOfAllDocuments_SumEquals100(){
        Manager document = Manager.create();
        document.addDocument("1","20200101");
        document.registerDocument(10,1, order, "1","20200101");
        document.registerDocument(20,2, order, "1","20200101");
        document.registerDocument(30,3, order, "1","20200101");
        document.registerDocument(40,4, order, "1","20200101");
        assertEquals(100,document.getDocuments().get("1").getSumOfDocuments());
    }
}
