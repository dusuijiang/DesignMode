package com.designmode.template_method;

/**
 * Created by Administrator on 2018/5/24.
 */

public abstract class LoginTemplate {

    public final boolean login(LoginModel lm){
        LoginModel dbLm = this.findLoginUser(lm.getLoginId());

        if (dbLm != null){
            String encryptPwd = this.encryptPwd(lm.getPwd());
            lm.setPwd(encryptPwd);
            return this.match(lm,dbLm);
        }
        return false;
    }

    /**
     * 判断用户填写的登录数据和存储中对应的数据是否匹配得上
     * @param lm
     * @param dbLm
     * @return
     */
    private boolean match(LoginModel lm, LoginModel dbLm) {
        if(lm.getLoginId().equals(dbLm.getLoginId())
                && lm.getPwd().equals(dbLm.getPwd())){
            return true;
        }
        return false;
    }

    /**
     * 对密码进行加密
     * @param pwd
     * @return
     */
    public String encryptPwd(String pwd) {
        return  pwd;
    }

    protected abstract LoginModel findLoginUser(String loginId);
}
