package com.zqsign.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Advice {
	@AfterReturning(pointcut = "execution(* com.zqsign.service..*.add*(..)) && args(name)", returning = "returnValue")
	public void add(String name,Object returnValue) {
		System.out.println("请求参数"+name);
		System.out.println("返回参数returnValue = " + returnValue);
	}
	
	@Around("execution(* com.zqsign.service..*.delete*(..))")
    public Object process(ProceedingJoinPoint point) throws Throwable {
        System.out.println("请求之前模拟处理");
        //获取请求参数
        Object[] args = point.getArgs();
        if (args != null && args.length > 0 && args[0].getClass() == String.class) {
            args[0] = "请求参数1";
        }
        //改变请求参数后继续执行目标方法
        Object returnValue = point.proceed(args);
        
        System.out.println("返回值："+returnValue);
        return returnValue ;
    }
}
