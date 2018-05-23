package com.designmode.template_factory;

/**
 * Created by Administrator on 2018/5/22.
 */

public class ExportFileOperate extends ExportOperate {
    @Override
    protected ExportFileApi factoryMethod() {
        return new ExportTextFile();
    }
}
