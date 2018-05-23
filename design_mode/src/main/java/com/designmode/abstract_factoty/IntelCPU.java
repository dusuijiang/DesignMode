package com.designmode.abstract_factoty;

/**
 * Created by Administrator on 2018/5/22.
 */

public class IntelCPU implements CPUApi {
    private int pins = 0;

    public IntelCPU(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        System.out.println(" IntelCPU  pins : " +pins );
    }
}
