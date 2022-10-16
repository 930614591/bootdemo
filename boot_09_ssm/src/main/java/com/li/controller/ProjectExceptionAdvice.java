package com.li.controller;

import com.li.exception.BusinessException;
import com.li.exception.SystemException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
//本类需要被扫描到 （mvc配置）
//1声明用来Rest风格异常处理
@RestControllerAdvice
public class ProjectExceptionAdvice {
    //用来处理程序错误,声明异常处理标志，拦截异常标志,并在参数里设置拦截类型
    @ExceptionHandler(Exception.class)
    public Result doExceptionHandler(Exception e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发
        System.out.println("异常1");
        return new Result(Code.SYSTEM_UNKNOW_ERR ,null,"系统未知异常");
    }

        //自定义系统异常
    @ExceptionHandler(SystemException.class)
    public Result doExceptionHandler(SystemException e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发
        return  new Result(e.getCode(),null,e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doExceptionHandler(BusinessException e) {
        //记录日志
        //发送消息给运维
        //发送邮件给开发
        return  new Result(e.getCode(),null,e.getMessage());
    }
}
