package com.designmode.template_factory;

/**
 * Created by Administrator on 2018/5/21.
 */

public class Client {
    public static void main(String[] args){
        ExportOperate operate = new ExportDbOperate();
        operate.export("导出文件到数据库");
    }
}
