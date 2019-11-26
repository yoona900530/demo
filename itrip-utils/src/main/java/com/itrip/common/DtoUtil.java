package com.itrip.common;

import com.itrip.beans.dto.Dto;

public class DtoUtil {
    private static final String FLAG_SUCCESS="success";
    private static final String FLAG_FAIL="fail";
    public static Dto returnSuccess(){
        Dto dto = new Dto();
        dto.setErrorCode(ErrorCode.NO_ERROR);
        dto.setSuccess(FLAG_SUCCESS);
        return dto;
    }
    public static Dto returnSuccess(String msg){
        Dto dto = new Dto();
        dto.setErrorCode(ErrorCode.NO_ERROR);
        dto.setSuccess(FLAG_SUCCESS);
        dto.setMsg(msg);
        return dto;
    }
    public static Dto returnSuccess(Object data){
        Dto dto = new Dto();
        dto.setErrorCode(ErrorCode.NO_ERROR);
        dto.setSuccess(FLAG_SUCCESS);
        dto.setData(data);
        return dto;
    }
    public static Dto returnSuccess(String msg, Object data){
        Dto dto = new Dto();
        dto.setErrorCode(ErrorCode.NO_ERROR);
        dto.setSuccess(FLAG_SUCCESS);
        dto.setMsg(msg);
        dto.setData(data);
        return dto;
    }
    public static Dto returnFail(){
        Dto dto = new Dto();
        dto.setErrorCode(ErrorCode.DEFAULT_ERROR);
        dto.setSuccess(FLAG_FAIL);
        return dto;
    }
    public static Dto returnFail(String msg){
        Dto dto = new Dto();
        dto.setErrorCode(ErrorCode.DEFAULT_ERROR);
        dto.setSuccess(FLAG_FAIL);
        dto.setMsg(msg);
        return dto;
    }
}
