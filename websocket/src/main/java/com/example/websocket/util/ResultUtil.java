package com.example.websocket.util;

public class ResultUtil {

    /**
     * 返回成功，传入返回体具体出參
     * @param object
     * @return
     */
    public static ResponseResult success(Object object){
        ResponseResult result = new ResponseResult();
        result.setCode(200);
        result.setMsg("success");
        result.setData(object);
        return result;
    }

    public static ResponseResult success(String msg) {
        ResponseResult result = new ResponseResult();
        result.setCode(200);
        result.setMsg(msg);
        return result;
    }

    /**
     * 提供给部分不需要出參的接口
     * @return
     */
    public static ResponseResult success(){
        return success(null);
    }


    /**
     * 自定义错误信息
     * @param code
     * @param msg
     * @return
     */
    public static ResponseResult error(Integer code,String msg){
        ResponseResult result = new ResponseResult();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

    /**
     * 返回异常信息，在已知的范围内
     * @param exceptionEnum
     * @return
     */
    public static ResponseResult error(ExceptionEnum exceptionEnum){
        ResponseResult result = new ResponseResult();
        result.setCode(exceptionEnum.getCode());
        result.setMsg(exceptionEnum.getMsg());
        result.setData(null);
        return result;
    }
}