package com.designmode.adapter_pattern;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/5/21.
 */

public class LogFileOperate implements LogFileOperateApi {

    private String logFilePathName = "adapter.log";

    public LogFileOperate(String logFilePathName) {
        if (logFilePathName != null && logFilePathName.trim().length() > 0)
            this.logFilePathName = logFilePathName;
    }

    @Override
    public List<LogModel> readLogFile() {
        List<LogModel> logModelList = null;
        ObjectInputStream oin = null;
        File file = new File(logFilePathName);
        if (file.exists()){
            try {
                oin = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
                logModelList = (List<LogModel>) oin.readObject();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (oin != null){
                        oin.close();
                    }
                }catch (IOException e){

                }

            }
        }
        return logModelList;
    }

    @Override
    public void writeLogFile(List<LogModel> logModelList) {
        List<LogModel> modelList = readLogFile();
        if (modelList == null){
            modelList = new ArrayList<>();
        }
        modelList.addAll(logModelList);
        File file = new File(logFilePathName);
        ObjectOutputStream oout = null;

        try {
            oout = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            oout.writeObject(modelList);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (oout != null){
                    oout.close();
                }
            }catch (IOException e){

            }
        }
    }
}
