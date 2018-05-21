package com.designmode.adapter_pattern;

import java.lang.reflect.Modifier;
import java.util.List;

/**
 * Created by Administrator on 2018/5/21.
 */

public interface LogFileOperateApi {
    /**
     * 读取日志
     * @return
     */
    List<LogModel> readLogFile();

    /**
     * 写入日志
     * @param logModelList
     */
    void writeLogFile(List<LogModel> logModelList);
}
