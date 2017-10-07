package com.wujunwen.Exception;

import com.wujunwen.Enum.ResultEnum;

/**
 * 尤其注意在spring中只对untimexception进行事务回滚，直接继承Exeption是不行的
 * Created by Keven on 2017/10/7.
 */
public class GirlException extends RuntimeException {
    private  Integer code;

    public GirlException(ResultEnum resultEnum) {
        //父类中本身会传一个message作为构造方法
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
