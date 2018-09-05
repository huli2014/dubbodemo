package com.dubbo.demo;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author admin
 * @Title: DemoController
 * @ProjectName dubbodemo
 * @Description: TODO
 * @date 2018/9/410:01
 */
@Controller
@RequestMapping("/demo")
public class DemoController {
    @Reference
    private DemoService demoService;


    @RequestMapping("/index")
    public String toIndex(Model model) {
        System.out.println("--------------ddddd");
        String ip = demoService.demoPrint();
        model.addAttribute("ip",ip);
        return "index";
    }
}
