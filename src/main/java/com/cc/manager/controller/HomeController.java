package com.cc.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cc.manager.domain.Msg;

/**
 * 
 * @ClassName:     HomeController   
 * @Description:   TODO(这里用一句话描述这个类的作用)   
 * @author:        chumengcheng
 * @date:          2020年5月29日 下午4:05:00
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        Msg msg =  new Msg("测试标题","测试内容","额外信息，只对管理员显示");
        model.addAttribute("msg", msg);
        return "home";
    }
}
