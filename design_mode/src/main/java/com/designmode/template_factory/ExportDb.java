package com.designmode.template_factory;

/**
 * Created by Administrator on 2018/5/22.
 */

public class ExportDb implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("ExportDb :  " + data);
        return true;
    }
}
