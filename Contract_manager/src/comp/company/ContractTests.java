package com.company;

import comp.company.manager;
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
}