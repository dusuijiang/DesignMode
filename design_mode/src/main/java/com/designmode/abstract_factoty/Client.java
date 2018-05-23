package com.designmode.abstract_factoty;

/**
 * Created by Administrator on 2018/5/21.
 */

public class Client {
    public static void main(String[] args){
        ComputerEngineer computerEngineer = new ComputerEngineer();

        AbstractFactory schema = new Schemal1();
        computerEngineer.makeComputer(schema);
    }
}
