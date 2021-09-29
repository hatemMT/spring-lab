package com.emaratech;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger LOGGER = Logger.getLogger(LoggingAspect.class.getName());

    @Pointcut("@annotation(Logged)")
    public void pointCut() {
    }

    @Around("pointCut()")
    public Object advice(ProceedingJoinPoint joinPoint) throws Throwable {
        LOGGER.info("calling method : " + joinPoint.getTarget().toString());
        Object proceed = joinPoint.proceed();
        LOGGER.info("calling is done for method : " + joinPoint.getTarget().toString());
        return proceed;
    }
}
