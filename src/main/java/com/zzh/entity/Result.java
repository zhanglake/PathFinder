package com.zzh.entity;

/**
 * Created by zhenghua.zhang on 2017/12/20.
 */
public class Result {

    public static enum ResultStatus {
        SUCCESS("成功"), ERROR("失败"), WARNING("警告"), INFO("提示");

        private String status;

        ResultStatus(String status) {
            this.status = status;
        }
    }

    private Integer code;
    private ResultStatus status;
    private String message;
    private Object data;

    public Result() {
        this.code = 200;
        this.status = ResultStatus.SUCCESS;
        this.message = "操作成功";
    }

    public Result(String message) {
        this.code = 200;
        this.status = ResultStatus.SUCCESS;
        this.message = message;
    }

    public Result(Object data) {
        this.code = 200;
        this.status = ResultStatus.SUCCESS;
        this.message = "操作成功";
        this.data = data;
    }

    public Result(String message, Object data) {
        this.code = 200;
        this.status = ResultStatus.SUCCESS;
        this.message = message;
        this.data = data;
    }

    public Result(Integer code, ResultStatus status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public Result(Integer code, ResultStatus status, String message, Object data) {
        this.code = code;
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setStatus(ResultStatus status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {

        return code;
    }

    public ResultStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {

        return data;
    }
}
