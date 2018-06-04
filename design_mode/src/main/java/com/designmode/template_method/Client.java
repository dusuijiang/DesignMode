package com.designmode.template_method;

/**
 * 模板方法
 */

public class Client {
    public static void main(String[] args){

        LoginModel lm = new LoginModel();
        lm.setLoginId("admin");
        lm.setPwd("workerPwd");

        LoginTemplate lt = new WorkerLogin();
        LoginTemplate lt2 = new NormalLogin();

        boolean flag = lt.login(lm);
        System.out.println(" 可登录工作平台 : " +flag);
        boolean flag2 = lt2.login(lm);
        System.out.println(" 可进行普通人员进行登录 : " +flag2);
    }
}
