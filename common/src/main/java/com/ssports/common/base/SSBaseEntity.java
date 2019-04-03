package com.ssports.common.base;

import java.io.Serializable;

/**
 * Created by rocky on 2019/4/3.
 */

public class SSBaseEntity implements Serializable {

    protected int resultCode;
    protected String msg;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


}
