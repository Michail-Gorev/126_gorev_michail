package comp.company;


import org.junit.*;

public class ContractTests extends Assert {

    @Test
    public void create_CreateListOfContracts_ContractsCountEqualsZero(){
        manager contractPayment = manager.create();
        assertEquals(0, contractPayment.getContractsCount());
    }
    @Test
    public void addContract_AddContractsWithNumberAndDate_PaymentDocumentCountEqualsZero(){
        manager contractPayment = manager.create();
        contractPayment.addContract("1","20200101");
        assertEquals(0, contractPayment.getContracts().get(1).getDocumentCount());
    }

    @Test
    public void addContract_AddContractWithNumberAndDate_ContractsCountEqualsOne(){
        manager contractManager = manager.create();
        contractManager.addContract("1","20211218");
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
        contractManager.registerPaymentDocument(100,1010,PaymentOrder,"1","20211219");
        assertEquals(1, contractManager.getContracts().get("1").getDocumentCount());
    }
}