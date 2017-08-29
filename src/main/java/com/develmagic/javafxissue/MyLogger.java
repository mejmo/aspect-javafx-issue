package com.develmagic.javafxissue;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class MyLogger {

    public MyLogger() {}

    @AfterReturning("execution(* com.develmagic..*.*(..))")
    public void logMethodAccessAfter(JoinPoint joinPoint) {
        if (log.isDebugEnabled()) {
            log.debug("***** Completed: " + joinPoint.getSignature().getName() + " *****");
        }
    }

    @Before("execution(* com.develmagic..*.*(..))")
    public void logMethodAccessBefore(JoinPoint joinPoint) {
        if (log.isDebugEnabled()) {
            log.debug("***** Starting: " + joinPoint.getSignature().getName() + " *****");
//            log.debug("***** Arguments: " + String.join(", ", Arrays.stream(joinPoint.getArgs()).map(o -> o.toString()).collect(Collectors.toList())));
        }
    }

}