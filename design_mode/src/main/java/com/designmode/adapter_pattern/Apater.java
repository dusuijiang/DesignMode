package com.designmode.adapter_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/21.
 */

public class Apater implements LogDbOperateApi {

    private LogFileOperateApi logFileOperateApi;

    public Apater(LogFileOperateApi logFileOperateApi){
        this.logFileOperateApi = logFileOperateApi;
    }
    @Override
    public void createLog(LogModel lm) {
        /**
         * 1. 读取日志
         */
        List<LogModel> logModelList = logFileOperateApi.readLogFile();

        if (logModelList == null){
            logModelList = new ArrayList<>();
        }
        /**
         * 2. 加入新日志
         */
        logModelList.add(lm);

        /**
         * 3. 重新写入
         */
        logFileOperateApi.writeLogFile(logModelList);
    }

    @Override
    public void updataLog(LogModel lm) {
        /**
         * 1. 读取日志
         */
        List<LogModel> logModelList = logFileOperateApi.readLogFile();
        if (logModelList == null){
            logModelList = new ArrayList<>();
        }
        /**
         * 2. 修改日志
         */
        for (int i = 0; i <logModelList.size() ; i++) {
            if (logModelList.get(i).getLogId().equals(lm.getLogId())){
                logModelList.set(i,lm);
                break;
            }
        }

        /**
         * 3. 重新写入
         */
        logFileOperateApi.writeLogFile(logModelList);
    }

    @Override
    public void removeLog(LogModel lm) {
        /**
         * 1. 读取日志
         */
        List<LogModel> logModelList = logFileOperateApi.readLogFile();
        if (logModelList == null){
            logModelList = new ArrayList<>();
        }
        /**
         * 2. 删除日志
         */
        logModelList.remove(lm);

        /**
         * 3. 重新写入
         */
        logFileOperateApi.writeLogFile(logModelList);
    }

    @Override
    public List<LogModel> getAllLog() {
        return logFileOperateApi.readLogFile();
    }
}
