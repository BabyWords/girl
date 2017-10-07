package com.wujunwen.Utils;

import com.wujunwen.Domain.Result;

/**
 * Created by Keven on 2017/10/7.
 */
public class ResultUtil {
    public static Result success(Object object){
        Result result=new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    /**
     * 即使成功也有可能result为null
     * @return
     */
    public static Result success(){
        return success(null);
    }

    public  static Result error(Integer code,String msg){
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
