package com.taokaila.cms.controller.system;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: LeoZhang
 * Date: 2016-04-17
 * Time: 17:38
 * To change this template use File | Settings | Editor | File and Code Templates.
 */
@Slf4j
@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String login(){
        log.info("login========================> ");
        return "system/index/main";
    }

    /**
     * 进入主界面
     * @return
     */
    @RequestMapping(value = "index",method = RequestMethod.GET)
    public String index(){
        log.info("index========================> ");
        return "system/index/main";
    }

    /**
     * 进入欢迎界面
     * @return
     */
    @RequestMapping(value = "index/welcome",method = RequestMethod.GET)
    public String welcome(){
        log.info("welcome========================> ");
        return "system/index/welcome";
    }

}
