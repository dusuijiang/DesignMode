package com.designmode.simple_factory;



import com.designmode.Utlis;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by Administrator on 2018/5/21.
 */

public class FactoryPlus {

    public static Api createApi(String clz){

        Properties p = new Properties();

        try {
            p.load(new InputStreamReader(new FileInputStream(Utlis.SIMPLE_FACTORYP_ROPERTIES),"UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("加载出错");
        }

        Api api = null;
        try {
            api =  (Api) Class.forName(p.getProperty(clz)).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }

}
