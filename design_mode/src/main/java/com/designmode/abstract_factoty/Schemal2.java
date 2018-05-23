package com.designmode.abstract_factoty;

/**
 * Created by Administrator on 2018/5/22.
 * AMD CPU  微星主板
 */

public class Schemal2 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new AMDCPU(936);
    }

    @Override
    public MainboradApi createMainboradApi() {
        return new MSIMainboard(936);
    }
}
