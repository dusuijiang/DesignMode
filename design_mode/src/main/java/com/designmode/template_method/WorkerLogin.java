package com.designmode.template_method;

/**
 * 工作人员登录逻辑
 */

public class WorkerLogin extends LoginTemplate {
    @Override
    protected LoginModel findLoginUser(String loginId) {
        LoginModel lm = new LoginModel();
        lm.setLoginId(loginId);
        lm.setPwd("workerPwd");
        return lm;
    }

    @Override
    public String encryptPwd(String pwd) {
        System.out.println("使用MD5进行密码加密");
        return pwd;
    }
}
