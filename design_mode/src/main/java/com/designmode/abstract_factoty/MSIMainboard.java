package com.designmode.abstract_factoty;

/**
 * Created by Administrator on 2018/5/22.
 * 微星主板
 */

public class MSIMainboard implements MainboradApi {

    private int cpuHoles = 0;
    public MSIMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println(" MSIMainboard  cpuHoles : " +cpuHoles );
    }
}
