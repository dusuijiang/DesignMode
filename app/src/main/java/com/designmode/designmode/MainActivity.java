package com.designmode.designmode;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.icu.text.LocaleDisplayNames;
import android.os.Build;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

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

public class MainActivity extends AppCompatActivity {

    private File file;
    private String filename;
    private Button but2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= 23) {
            getImeiPerssion();
        }

        Button but1 = findViewById(R.id.but1);

        but2 = findViewById(R.id.but2);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        //saveInternal();
                        LogModel logModel = new LogModel();
                        logModel.setLogContent("111");
                        logModel.setLogId("1000000");
                        logModel.setOperateTime("111111");
                        logModel.setOperateUser("111");
                        List<LogModel> logModelList = new ArrayList<>();
                        logModelList.add(logModel);
                        writeLogFile(logModelList);
                    }
                }).start();

            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getInternal();
                Log.d("TAG","  " + readLogFile());
                //readLogFile();
            }
        });
    }

    public void getImeiPerssion() {

        if (!isGranted_(Manifest.permission.WRITE_EXTERNAL_STORAGE)) {
            String[] permissions2 = new String[1];
            permissions2[0] = Manifest.permission.WRITE_EXTERNAL_STORAGE;
            ActivityCompat.requestPermissions(
                    MainActivity.this, permissions2, 1000
            );
        }

        if (!isGranted_(Manifest.permission.READ_PHONE_STATE)) {
            String[] permissions1 = new String[1];
            permissions1[0] = Manifest.permission.READ_PHONE_STATE;
            ActivityCompat.requestPermissions(
                    MainActivity.this, permissions1, 1001
            );
        }

        if (!isGranted_(Manifest.permission.READ_SMS)) {
            String[] permissions3 = new String[1];
            permissions3[0] = Manifest.permission.READ_SMS;
            ActivityCompat.requestPermissions(
                    MainActivity.this, permissions3, 1002
            );
        }


        if (!isGranted_(Manifest.permission.READ_EXTERNAL_STORAGE)) {
            String[] permissions3 = new String[1];
            permissions3[0] = Manifest.permission.READ_EXTERNAL_STORAGE;
            ActivityCompat.requestPermissions(
                    MainActivity.this, permissions3, 1003
            );
        }
    }
    private boolean isGranted_(String permission) {
        int checkSelfPermission = ActivityCompat.checkSelfPermission(this, permission);
        return checkSelfPermission == PackageManager.PERMISSION_GRANTED;
    }


    public String path= Environment.getExternalStorageDirectory().getAbsolutePath()+"/CatalogData";
    private void mkdir(){

    }
   /* public void saveInternal() {
        String fileContent = "最难受的思念显";
        FileOutputStream outputStream;
        File dir=new File(path);
        if(!dir.isDirectory()){
            dir.mkdir();
        }
        File file= new File(path+"/catalogdata.txt");
        filename = file.getAbsolutePath();
        Log.d("TAG", filename);
        try {
            outputStream = new FileOutputStream(filename);
            outputStream.write(fileContent.getBytes("utf-8"));
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void getInternal() {
        byte[] buffer = new byte[1024];
        FileInputStream fileInputStream;

        try {
            fileInputStream = new FileInputStream(filename);
            fileInputStream.read(buffer);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

       // Log.d("TAG",new String(buffer));
        //but2.setText(new String(buffer));
    }
*/
    public List<LogModel> readLogFile() {
        File dir=new File(path);
        if(!dir.isDirectory()){
            dir.mkdir();
        }
        File file= new File(path+"/catalogdata.txt");
        List<LogModel> logModelList = null;
        ObjectInputStream oin = null;
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

    public void writeLogFile(List<LogModel> logModelList) {
        File dir=new File(path);
        if(!dir.isDirectory()){
            dir.mkdir();
        }
        File file= new File(path+"/catalogdata.txt");

        List<LogModel> modelList = readLogFile();
        if (modelList == null){
            modelList = new ArrayList<>();
        }
        modelList.addAll(logModelList);
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
