package com.shishu.common.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * AOP 记录用户操作日志
 *
 * @author MrBird
 * @link https://mrbird.cc/Spring-Boot-AOP%20log.html
 */
@Aspect
@Component
public class LogAspect {
//
//    private Logger log = LoggerFactory.getLogger(this.getClass());
//
//    @Autowired
//    private FebsProperties febsProperties;
//
//    @Autowired
//    //private LogService logService;
//
//
//    @Pointcut("@annotation(cc.mrbird.common.annotation.Log)")
//    public void pointcut() {
//        // do nothing
//    }
//
//    @Around("pointcut()")
//    public Object around(ProceedingJoinPoint point) throws JsonProcessingException {
//        Object result = null;
//        long beginTime = System.currentTimeMillis();
//        try {
//            // 执行方法
//            result = point.proceed();
//        } catch (Throwable e) {
//            log.error(e.getMessage());
//        }
//        // 执行时长(毫秒)
//        // 获取request
//        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
//        // 设置IP地址
//        String ip = IPUtils.getIpAddr(request);
//        long time = System.currentTimeMillis() - beginTime;
//        if (febsProperties.isOpenAopLog()) {
//            // 保存日志
//            User user = (User) SecurityUtils.getSubject().getPrincipal();
//            SysLog log = new SysLog();
//            log.setUsername(user.getUsername());
//            log.setIp(ip);
//            log.setTime(time);
//            logService.saveLog(point, log);
//        }
//        return result;
//    }
}
