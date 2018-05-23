package com.designmode.abstract_factoty;

/**
 * Created by Administrator on 2018/5/22.
 */

public class AMDCPU implements CPUApi {
    private int pins = 0;

    public AMDCPU(int pins){
        this.pins = pins;
    }
    @Override
    public void calculate() {
        System.out.println(" AMDCPU  pins : " +pins );
    }
}
