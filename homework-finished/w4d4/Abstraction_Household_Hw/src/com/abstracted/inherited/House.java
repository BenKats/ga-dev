package com.abstracted.inherited;

abstract class House {
    double networth;
    double salary;
    double taxRate;
    Pet pet;

    public House(double networth, double salary, int taxRate, Pet pet ){
        this.networth = networth;
        this.salary = salary;
        this.taxRate = taxRate;
        this.pet = pet;

    }

    abstract double payTaxes(double salary);

    public void earnMoney(){
        double taxes = payTaxes(this.salary);
        double profit = this.salary - taxes;
        this.networth += profit;
        System.out.println("You earned $" + profit + "\nYou have a networth of $" + this.networth);
    }

}

class Mansion extends House{

    public Mansion(double networth, double salary, int taxRate, Pet pet) {
        super(networth, salary, taxRate, pet);
    }

    @Override
    double payTaxes(double salary) {
        double taxes = salary * ((100-taxRate/2)/100.0);
        System.out.println("You gamed the system! You paid 50% less in taxes");
        return taxes;
    }
}

class Bungalow extends House{

    public Bungalow(double networth, double salary, int taxRate, Pet pet) {
        super(networth, salary, taxRate, pet);
    }

    @Override
    double payTaxes(double salary) {
        double taxes = salary * ((100-taxRate)/100.0);
        System.out.println("You can not avoid Death and Taxes");
        return taxes;
    }
}
