package com.autel.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * 自定义filter，访问路径带有token参数的能正常访问，不带有token的拒绝访问
 * http://localhost:3800/eureka-client/app/port
 * http://localhost:3800/producer/app/port
 * http://localhost:3800/eureka-client/app/port?token=dd
 * @author A20019
 * @date 2020/3/25
 */
public class TokenFilter extends ZuulFilter {

    private static final Logger LOGGER  = LoggerFactory.getLogger(TokenFilter.class);

    /**
     *  可以在请求被路由之前调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     *  filter执行顺序，通过数字指定 ，优先级为0，数字越大，优先级越低
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     *   是否执行该过滤器，此处为true，说明需要过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {

        HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
        LOGGER.info("TokenFilter.." + request.getMethod() + request.getRequestURI().toString());

        String token = request.getParameter("token");

        //对请求进行路由
        if(StringUtils.isNotBlank(token)){
            RequestContext.getCurrentContext().setSendZuulResponse(true);
            RequestContext.getCurrentContext().setResponseStatusCode(200); //设置响应码
            RequestContext.getCurrentContext().set("is success",true);
            return null;
        }else{
            //不对请求进行路由
            RequestContext.getCurrentContext().setSendZuulResponse(false);
            RequestContext.getCurrentContext().setResponseStatusCode(400);
            RequestContext.getCurrentContext().setResponseBody("token is empty");
            RequestContext.getCurrentContext().set("is success",true);
            return null;
        }
    }
}
