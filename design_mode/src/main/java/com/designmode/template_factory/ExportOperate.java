package com.designmode.template_factory;

/**
 * Created by Administrator on 2018/5/22.
 */

public abstract class ExportOperate {

    public boolean export(String data){
        ExportFileApi exportFileApi = factoryMethod();
        return exportFileApi.export(data);
    }

    protected abstract ExportFileApi factoryMethod();
}
