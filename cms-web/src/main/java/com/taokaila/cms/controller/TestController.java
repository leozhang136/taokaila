package com.taokaila.cms.controller;

import com.taokaila.cms.constant.ConfigBean;
import com.taokaila.cms.inner.service.InnerTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: LeoZhang
 * Date: 2016-04-16
 * Time: 22:07
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
@Slf4j
@Controller
@RequestMapping("/test/")
public class TestController {

    @Autowired
    private InnerTestService innerTestService;

    @Autowired
    private ConfigBean configBean;

    @RequestMapping(value = "test")
    public String test(){
        String info = innerTestService.getTestInfo("zhang san");
        System.out.println("info===>" + info);
        log.info("thread city size "+configBean.getThreadCitySize());
        log.info("info===>"+info);
        return "system/index/main";
    }
}
