package com.markerhub.common.lang;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    private String code;//200是正常 非200为异常
    private String msg;
    private Object data;

    public static Result succ(Object data) {
        return succ("200","操作成功",data);
    }

    public static Result succ(String code,String msg, Object data) {
        Result m = new Result();
        m.setCode(code);
        m.setData(data);
        m.setMsg(msg);
        return m;
    }

    public static Result fail(Object data) {
        return fail("400","操作失败",data);
    }

    public static Result fail(String code, String msg, Object data) {
        Result m = new Result();
        m.setCode(code);
        m.setData(data);
        m.setMsg(msg);
        return m;
    }
}
