package net.avalon.gulimall.product.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Description:
 *
 * @Author: Weiyin
 * @Create: 2023/2/24 - 20:43
 */
@Aspect
public class CommonPointCuts {

    @Pointcut("execution(* net.avalon..controller..*.*(..))")
    public void controller(){}

}
