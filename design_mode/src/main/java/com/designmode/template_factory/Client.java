package com.designmode.template_factory;

/**
 * 工厂方法.
 */

public class Client {
    public static void main(String[] args){
        ExportOperate operate = new ExportDbOperate();
        operate.export("导出文件到数据库");
    }
}
