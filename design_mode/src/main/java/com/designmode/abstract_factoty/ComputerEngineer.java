package com.designmode.abstract_factoty;

/**
 * Created by Administrator on 2018/5/22.
 */

public class ComputerEngineer {
    private CPUApi cpuApi = null;

    private MainboradApi mainboradApi = null;

    public void makeComputer(AbstractFactory schema){
        //准备装机配件
        prepareHardwares(schema);

        //组装电脑

        //测试电脑

        //交付客户
    }

    private void prepareHardwares(AbstractFactory schema) {
        this.cpuApi = schema.createCPUApi();
        this.mainboradApi = schema.createMainboradApi();

        //测试配件是否可用
        this.cpuApi.calculate();
        this.mainboradApi.installCPU();
    }
}
