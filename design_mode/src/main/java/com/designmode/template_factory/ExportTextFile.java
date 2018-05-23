package com.designmode.template_factory;

/**
 * Created by Administrator on 2018/5/22.
 */

public class ExportTextFile implements ExportFileApi {
    @Override
    public boolean export(String data) {
        System.out.println("ExportTextFile :  " + data);
        return true;
    }
}
