package comp.company;


import org.junit.*;

public class ContractTests extends Assert {

    @Test
    public void create_CreateListOfContracts_ContractsCountEqualsZero(){
        manager contractPayment = manager.create();
        assertEquals(0, contractPayment.getContractsCount());
    }

    @Test
    public void addContract_AddContractWithNumberAndDate_ContractsCountEqualsOne(){
        manager contractPayment = manager.create();
        contractPayment.addContract("1","01012020");
        assertEquals(1, contractPayment.getContractsCount());
    }
    @Test
    public void addContract_AddContractsWithNumberAndDate_ContractsCountEqualFour(){
        manager contractPayment = manager.create();
        contractPayment.addContract("1","01012020");
        contractPayment.addContract("1001","01012020");
        contractPayment.addContract("90","01012020");
        contractPayment.addContract("102","20211218");
        assertEquals(4, contractPayment.getContractsCount());
    }
}