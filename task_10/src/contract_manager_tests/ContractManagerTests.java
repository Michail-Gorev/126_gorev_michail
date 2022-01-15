package contract_manager_tests;


import contract_manager.Manager;
import org.junit.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

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
    @Test
    public void getList_GetListOfAllDocuments_ListEqualsTestOne(){
        Manager document = Manager.create();
        document.addDocument("1","20200101");
        document.registerDocument(10,1, order, "1","20200101");
        document.registerDocument(20,2, order, "1","20200101");
        document.registerDocument(30,3, order, "1","20200101");
        document.registerDocument(40,4, order, "1","20200101");
        document.addDocument("2","20200101");
        document.registerDocument(100,1, order, "2","20200101");
        document.registerDocument(200,2, order, "2","20200101");
        document.registerDocument(300,3, order, "2","20200101");
        document.registerDocument(400,4, order, "2","20200101");

        List<Integer> DOCUMENTS = new ArrayList();
        DOCUMENTS.add(10);
        DOCUMENTS.add(20);
        DOCUMENTS.add(30);
        DOCUMENTS.add(40);
        DOCUMENTS.add(100);
        DOCUMENTS.add(200);
        DOCUMENTS.add(300);
        DOCUMENTS.add(400);

        assertArrayEquals(DOCUMENTS.toArray(),Manager.getAllDocuments().toArray());
    }
    @Test
    public void deletingDocument_DeletingDocumentWithNumbersAndDate_DocumentsNumberEqualsOne(){
        Manager document = Manager.create();
        document.addDocument("1","20200101");
        document.registerDocument(10,1, order, "1","20200101");
        document.registerDocument(20,2, order, "1","20200101");
        document.deleteDocument(2,"1","20200101");
        assertEquals(1,document.getDocuments().get("1").getDocumentsNumber());
    }
    @Test
    public void deletingAllDocuments_DeletingAllDocumentsWithNumbersAndDate_DocumentsNumberEqualsZero(){
        Manager document = Manager.create();
        document.addDocument("1","20200101");
        document.registerDocument(10,1, order, "1","20200101");
        document.registerDocument(20,2, order, "1","20200101");
        document.registerDocument(100,3, order, "1","20200101");
        document.registerDocument(200,4, order, "1","20200101");
        document.registerDocument(300,5, order, "1","20200101");
        document.registerDocument(400,6, order, "1","20200101");

        document.deleteDocument(1,"1","20200101");
        document.deleteDocument(2,"1","20200101");
        document.deleteDocument(3,"1","20200101");
        document.deleteDocument(4,"1","20200101");
        document.deleteDocument(5,"1","20200101");
        document.deleteDocument(6,"1","20200101");
        assertEquals(0,document.getDocuments().get("1").getDocumentsNumber());
    }
}
