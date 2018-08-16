package com.hnq.study.exception;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

/**
 * @author henengqiang
 * @date 2018/8/16
 */
@Aspect
@Component
public class WebExceptionAspect {

    private static final Logger logger = LoggerFactory.getLogger(WebExceptionAspect.class);

    /**
     * 凡是注解了 RequestMapping 的方法都被拦截
     */
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    private void webPointCut() {

    }

    /**
     * 拦截 web 层异常，记录异常日志，并返回友好信息到前端。目前只拦截 Exception，是否拦截 Error 需再作考虑
     * @param e 异常对象
     */
    @AfterThrowing(pointcut = "webPointCut()", throwing = "e")
    public void handleThrowing(Exception e) {
        e.printStackTrace();
        logger.error("发现异常！ {}", e.getMessage());
        logger.error(JSON.toJSONString(e.getStackTrace()));
        // 这里输出友好信息提示
        writeContent("出现异常");
        writeContent("出现异常，请检查");
    }

    /**
     * 将内容输出到浏览器
     * @param content   输出内容
     */
    private void writeContent(String content) {
        HttpServletResponse response = ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getResponse();
        if (response != null) {
            response.reset();
            response.setCharacterEncoding("UTF-8");
            response.setHeader("Content-Type", "text/plain;charset=UTF-8");
            response.setHeader("icop-content-type", "exception");
            PrintWriter pw = null;
            try {
                pw = response.getWriter();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (pw != null) {
                pw.println(content);
                pw.flush();
                pw.close();
            }
        }
    }

}
