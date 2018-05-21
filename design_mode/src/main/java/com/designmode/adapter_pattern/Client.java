package com.designmode.adapter_pattern;

import com.designmode.utils.DateUtil;

import java.util.ArrayList;
import java.util.List;

import static com.designmode.utils.DateUtil.getStringDate;

/**
 * Created by Administrator on 2018/5/21.
 */

public class Client {
    public static void main(String[] args) {
//        LogModel logModel = new LogModel();
//
//        logModel.setLogId("001");
//        logModel.setOperateUser("张三");
//        logModel.setOperateTime("2018-05-21 16:10:11");
//        logModel.setLogContent("第一次日志");
//
//        LogFileOperateApi logFileOperateApi = new LogFileOperate("");
//
//        List<LogModel> logModelList = new ArrayList<>();
//        logModelList.add(logModel);
//        logFileOperateApi.writeLogFile(logModelList);
//        System.out.println(" readLog : " +"\n" + logFileOperateApi.readLogFile() );

        LogModel logModel = new LogModel();
        logModel.setLogId("002");
        logModel.setOperateUser("张三0");
        logModel.setOperateTime(DateUtil.getStringDate());
        logModel.setLogContent("第一次日志11");

        LogFileOperateApi logFileOperateApi = new LogFileOperate("");

        LogDbOperateApi logDbOperateApi = new Apater(logFileOperateApi);

        logDbOperateApi.createLog(logModel);

        System.out.println(" readLog : " + "\n" + logDbOperateApi.getAllLog());
    }
}
