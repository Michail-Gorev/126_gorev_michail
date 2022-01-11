package comp.company;


import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static comp.company.DocumentType.*;
import java.util.HashMap;
import java.util.Map;

public class ContractTests extends Assert {

    @Test
    public void create_CreateListOfContracts_ContractsCountEqualsZero(){
        manager contractPayment = manager.create();
        assertEquals(0, contractPayment.getContractsCount());
    }
    @Test
    public void addContract_AddContractsWithNumberAndDate_PaymentDocumentCountEqualsZero(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        assertEquals(0, contractManager.getContracts().get(1).getDocumentCount());
    }

    @Test
    public void addContract_AddContractWithNumberAndDate_ContractsCountEqualsOne(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        assertEquals(1, contractManager.getContractsCount());
    }
    @Test
    public void addContract_AddContractsWithNumberAndDate_ContractsCountEqualFour(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.addContract("1001","20200101");
        contractManager.addContract("102","20200101");
        contractManager.addContract("90","20200101");
        assertEquals(4, contractManager.getContractsCount());
    }
    @Test
    public void registerPaymentDocument_RegisterPaymentDocumentWithData_DocumentsCountEqualsOne(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20211218");
        contractManager.registerPaymentDocument(1000,901,PaymentOrder,"1","20200101");
        assertEquals(1, contractManager.getContracts().get("1").getDocumentCount());
    }
    @Test
    public void registerPaymentDocument_RegisterPaymentDocumentWithData_DocumentsCountEqualsFour(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.registerPaymentDocument(1000,1,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(200,12,BankOrder,"1","20200101");
        contractManager.registerPaymentDocument(500,3,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(100,4,BankOrder,"1","20200101");
        assertEquals(4, contractManager.getContracts().get("1").getDocumentCount());
    }
    @Test
    public void calculationSum_CalculationContractSumOfPayments_SumEquals100(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.registerPaymentDocument(10,1,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(20,2,BankOrder,"1","20200101");
        contractManager.registerPaymentDocument(70,3,PaymentOrder,"1","20200101");
        assertEquals(100, contractManager.getContracts().get("1").getSumOfPayments());
    }
    @Test
    public void getList_GetListOfAllPayments_ListEqualsTestList(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.registerPaymentDocument(10,1,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(40,2,BankOrder,"1","20200101");
        contractManager.registerPaymentDocument(60,3,PaymentOrder,"1","20200101");
        contractManager.addContract("2","20200101");
        contractManager.registerPaymentDocument(20,4,PaymentOrder,"2","20200101");
        contractManager.registerPaymentDocument(50,5,BankOrder,"2","20200101");
        contractManager.registerPaymentDocument(70,6,PaymentOrder,"2","20200101");

        List<Integer> payments = new ArrayList();
        payments.add(10);
        payments.add(40);
        payments.add(60);
        payments.add(20);
        payments.add(50);
        payments.add(70);

        assertArrayEquals(payments.toArray(),contractManager.getAll().toArray());
    }

    @Test
    public void deleteDoc_DeleteDocWithContractNumberNumberAndDate_PaymentsCountEqualsThree(){
        manager contractManager = manager.create();

        contractManager.addContract("1","20200101");
        contractManager.registerPaymentDocument(10,1,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(40,2,BankOrder,"1","20200101");
        contractManager.registerPaymentDocument(50,3,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(60,4,PaymentOrder,"1","20200101");
        contractManager.deleteDoc(3,"1","20200101");
    assertEquals(3, contractManager.getContracts().get("1").getDocumentCount());
}
    @Test
    public void deleteAllDoc_DeleteAllDocWithContractNumberNumberAndDate_PaymentsCountEqualsZero(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20200101");
        contractManager.registerPaymentDocument(10,1,PaymentOrder,"1","20200101");
        contractManager.registerPaymentDocument(20,2,BankOrder,"1","20200101");
        contractManager.registerPaymentDocument(100,3,PaymentOrder,"1","20200101");
        contractManager.deleteDoc(1,"1","20200101");
        contractManager.deleteDoc(2,"1","20200101");
        contractManager.deleteDoc(3,"1","20200101");
        assertEquals(0, contractManager.getContracts().get("1").getDocumentCount());
    }

}