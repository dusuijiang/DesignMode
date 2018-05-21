package com.designmode.adapter_pattern;

import java.util.List;

/**
 * Created by Administrator on 2018/5/21.
 */

public interface LogDbOperateApi {
    /**
     * 新增日志
     * @param lm
     */
    void createLog(LogModel lm);

    /**
     * 更新日志
     * @param lm
     */
    void updataLog(LogModel lm);

    /**
     * 删除日志
     * @param lm
     */
    void removeLog(LogModel lm);

    /**
     * 获取日志
     * @return
     */
     List<LogModel> getAllLog();
}
