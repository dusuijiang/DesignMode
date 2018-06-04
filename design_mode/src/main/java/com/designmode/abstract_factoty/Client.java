package com.designmode.abstract_factoty;

/**
 * 抽象工厂
 */

public class Client {
    public static void main(String[] args){
        ComputerEngineer computerEngineer = new ComputerEngineer();

        AbstractFactory schema = new Schemal1();
        computerEngineer.makeComputer(schema);
    }
}
