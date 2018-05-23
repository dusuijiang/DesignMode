package com.designmode.template_factory;

/**
 * Created by Administrator on 2018/5/22.
 */

public class ExportDbOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportDb();
    }
}
