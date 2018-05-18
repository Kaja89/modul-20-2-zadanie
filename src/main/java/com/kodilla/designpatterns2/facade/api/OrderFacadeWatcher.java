package com.kodilla.designpatterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class OrderFacadeWatcher {
    private final Logger LOGGER = LoggerFactory.getLogger(OrderFacadeWatcher.class);

    @Before("execution(* com.kodilla.designpatterns2.facade.api.OrderFacade.processOrder(..))" + "&&target(object)")
    public void logEvent(Object object) {
        LOGGER.info("Starting method processOrder.." + object.getClass().getName());
    }


    @Around("execution(* com.kodilla.designpatterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();
            LOGGER.info("Consumed time :" + (end - begin) + "[ms]");
        } catch (Throwable throwable) {
            LOGGER.error("From watcher: " + throwable.getMessage());
            throw throwable;
        }
        return result;
    }
}
