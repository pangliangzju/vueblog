package com.liangpang.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * @author somnu
 */
@Data
public class Result implements Serializable {

    private int code;
    private String msg;
    private Object data;

    public static Result succ(Object data) {
        return succ(200, "操作成功", data);
    }

    public static Result succ(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(String msg) {
        Result r = new Result();
        r.setCode(400);
        r.setMsg(msg);
        r.setData(null);
        return r;
    }

    public static Result fail(String msg, Object data) {
        Result r = new Result();
        r.setCode(400);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
