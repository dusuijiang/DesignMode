package com.designmode.abstract_factoty;

/**
 * Created by Administrator on 2018/5/22.
 * 技嘉主板
 */

public class GAMainboard implements MainboradApi {

    private int cpuHoles = 0;
    public GAMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCPU() {
        System.out.println(" GAMainboard  cpuHoles : " +cpuHoles );
    }
}
