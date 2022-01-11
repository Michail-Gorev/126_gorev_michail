package comp.company;

import org.junit.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static comp.company.DocumentType.*;

public class ContractTests extends Assert {

    @Test
    public void create_CreateListOfContracts_ContractsCountEqualsZero(){
        manager contractManager = manager.create();
        assertEquals(0, contractManager.getContractsCount());
    }

    @Test
    public void addContract_AddContractWithNumberAndDate_ContractsCountEqualsOne(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        assertEquals(1, contractManager.getContractsCount());
    }

    @Test
    public void addContract_AddContractsWithNumberAndDate_ContractsCountEqualsFour(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.addContract("2","20200101");
        contractManager.addContract("3","20200101");
        contractManager.addContract("4","20200101");
        assertEquals(4, contractManager.getContractsCount());
    }

    @Test
    public void addContract_AddContractsWithNumberAndDate_PaymentDocumentCountEqualsZero(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        assertEquals(0, contractManager.getContracts().get("1").getDocumentCount());
    }

    @Test
    public void registerPaymentDocument_RegisterPaymentDocumentWithData_DocumentsCountEqualsOne(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.registerPaymentDocument(1000,1,PaymentOrder,"1","20200101");
        assertEquals(1, contractManager.getContracts().get("1").getDocumentCount());
    }

    @Test
    public void registerPaymentDocument_RegisterPaymentDocumentWithData_DocumentsCountEqualsFour(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.registerPaymentDocument(10,1,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(20,2,BankOrder,"1","20200101");
        contractManager.registerPaymentDocument(50,3,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(100,4,BankOrder,"1","20200101");
        assertEquals(4, contractManager.getContracts().get("1").getDocumentCount());
    }

    @Test
    public void calculationSum_CalculationContractSumOfPayments_AmountEquals100(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.registerPaymentDocument(40,1,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(30,2,BankOrder,"1","20200101");
        contractManager.registerPaymentDocument(30,3,PaymentOrder,"1","20200101");
        assertEquals(100, contractManager.getContracts().get("1").getSumOfPayments());
    }

    @Test
    public void deleteDoc_DeleteDocWithContractNumberNumberAndDate_PaymentsCountEqualsThree(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.registerPaymentDocument(10,1,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(20,2,BankOrder,"1","20200101");
        contractManager.registerPaymentDocument(50,3,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(100,4,PaymentOrder,"1","20200101");
        contractManager.deleteDoc(3,"1","20200101");
        assertEquals(3, contractManager.getContracts().get("1").getDocumentCount());
    }

    @Test
    public void deleteAllDocs_DeleteAllDocsWithContractNumberNumberAndDate_PaymentsCountEqualsZero(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.registerPaymentDocument(10,1,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(20,2,BankOrder,"1","20200101");
        contractManager.registerPaymentDocument(50,3,PaymentOrder,"1","20200101");
        contractManager.deleteDoc(1,"1","20200101");
        contractManager.deleteDoc(2,"1","20200101");
        contractManager.deleteDoc(3,"1","20200101");
        assertEquals(0, contractManager.getContracts().get("1").getDocumentCount());
    }

    @Test
    public void getList_GetListOfAllDocs_ListEqualsTestOne(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.registerPaymentDocument(10,1,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(20,2,BankOrder,"1","20200101");
        contractManager.registerPaymentDocument(50,3,PaymentOrder,"1","20200101");
        contractManager.addContract("2","20200101");
        contractManager.registerPaymentDocument(100,4,PaymentOrder,"2","20200101");
        contractManager.registerPaymentDocument(200,5,BankOrder,"2","20200101");
        contractManager.registerPaymentDocument(300,6,PaymentOrder,"2","20200101");

        List<Integer> payments = new ArrayList();
        payments.add(10);
        payments.add(20);
        payments.add(50);
        payments.add(100);
        payments.add(200);
        payments.add(300);

        assertArrayEquals(payments.toArray(),contractManager.getAllDocs().toArray());
    }

    @Test
    public void getDocs_GetAllDocsFromContract_ListEqualsTestOne(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.registerPaymentDocument(10,1,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(20,2,BankOrder,"1","20200101");
        contractManager.registerPaymentDocument(50,3,PaymentOrder,"1","20200101");
        contractManager.addContract("2","20200101");
        contractManager.registerPaymentDocument(100,4,PaymentOrder,"2","20200101");
        contractManager.registerPaymentDocument(200,5,BankOrder,"2","20200101");
        contractManager.registerPaymentDocument(300,6,PaymentOrder,"2","20200101");

        List<Integer> payments = new ArrayList();
        payments.add(10);
        payments.add(20);
        payments.add(50);

        assertArrayEquals(payments.toArray(),contractManager.getContracts().get("1").getListOfDocs().toArray());
    }

    @Test
    public void getMap_GetMapOfContractsWithSumOfPayments_MapEqualsTestOne(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.registerPaymentDocument(10,1,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(20,2,BankOrder,"1","20200101");
        contractManager.registerPaymentDocument(50,3,PaymentOrder,"1","20200101");
        contractManager.addContract("2","20200101");
        contractManager.registerPaymentDocument(100,4,PaymentOrder,"2","20200101");
        contractManager.registerPaymentDocument(200,5,BankOrder,"2","20200101");
        contractManager.registerPaymentDocument(300,6,PaymentOrder,"2","20200101");

        List<String> contractsTest = new ArrayList();
        List<Integer> paymentsTest = new ArrayList();
        contractsTest.add("1");
        paymentsTest.add(80);
        contractsTest.add("2");
        paymentsTest.add(600);

        HashMap<String,Integer> contractsWithPayments = contractManager.getAllContractsWithPay();
        List<String> contracts = new ArrayList();
        List<Integer> payments = new ArrayList();

        for (Map.Entry<String, Integer> entry: contractsWithPayments.entrySet()){
            contracts.add(entry.getKey());
            payments.add(entry.getValue());
        }

        assertArrayEquals(contractsTest.toArray(), contracts.toArray());
        assertArrayEquals(paymentsTest.toArray(), payments.toArray());
    }

}