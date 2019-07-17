package com.istic.base;


/**
 * Created by hch on 2017/7/12.
 */
public class BaseService {

    public Result success(String message) {
        return new Result().addSuccess(message);
    }

    public Result error(String message) {
        return new Result().addError(message);
    }

    public Result warn(String message) {
        return new Result().addWarn(message);
    }
    public Result fail(String message) {
        return new Result().addFail(message);
    }
}
