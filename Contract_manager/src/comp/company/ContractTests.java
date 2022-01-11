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
        manager contractPayment = manager.create();
        contractPayment.addContract("1","20200101");
        assertEquals(1, contractPayment.getContractsCount());
    }
    @Test
    public void addContract_AddContractsWithNumberAndDate_ContractsCountEqualFour(){
        manager contractPayment = manager.create();
        contractPayment.addContract("1","20200101");
        contractPayment.addContract("1001","20200101");
        contractPayment.addContract("90","20200101");
        contractPayment.addContract("102","20200101");
        assertEquals(4, contractPayment.getContractsCount());
    }
}