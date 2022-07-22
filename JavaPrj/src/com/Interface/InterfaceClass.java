package com.Interface;

public class InterfaceClass implements Interfacedemo {
    public static void main(String args[]){
        InterfaceClass o = new InterfaceClass();
        o.BankCustomer();
        o.PayCreditCard();
    }

    @Override
    public void PayCreditCard() {
        System.out.println("Credit card");
    }

    @Override
    public void BankCustomer() {
        System.out.println("Customer name is Bob");
    }
}
