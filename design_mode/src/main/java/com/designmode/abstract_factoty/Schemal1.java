package com.designmode.abstract_factoty;

/**
 * Created by Administrator on 2018/5/22.
 * Intel CPU  技嘉主板
 */

public class Schemal1 implements AbstractFactory {
    @Override
    public CPUApi createCPUApi() {
        return new IntelCPU(1156);
    }

    @Override
    public MainboradApi createMainboradApi() {
        return new GAMainboard(1156);
    }
}
