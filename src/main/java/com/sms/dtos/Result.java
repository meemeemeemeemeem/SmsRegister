package com.sms.dtos;

import lombok.Data;

import java.util.Date;

/**
 * @Author mei
 * @create 2023/3/31 10:54
 */
@Data
public class Result <T>{
    private T date;
    private int code;
    private String message;

    private Result(T data,int code, String message){
        this.date=data;
        this.code=code;
        this.message=message;
    }

    public static<T> Result<T> ok(T data){
        return new Result<T>(data,200,"ok");
    }
    public static<T> Result<T> error(T data){
        return new Result<T>(null,500,"error");
    }

}
