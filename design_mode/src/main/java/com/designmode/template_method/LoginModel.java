package com.designmode.template_method;

/**
 * Created by Administrator on 2018/5/24.
 */

public class LoginModel {

    private String loginId;
    private String pwd;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "LoginModel{" +
                "loginId='" + loginId + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
