package com.designmode.template_method;

/**
 * 普通用户登录控制的逻辑处理
 */

public class NormalLogin extends LoginTemplate {
    @Override
    protected LoginModel findLoginUser(String loginId) {
        LoginModel lm = new LoginModel();
        lm.setLoginId(loginId);
        lm.setPwd("testPwd");
        return lm;
    }


}
