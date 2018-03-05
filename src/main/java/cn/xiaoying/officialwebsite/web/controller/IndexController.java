package cn.xiaoying.officialwebsite.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("title","上海小应信息科技有限公司");

        return "index"; //render index.html
    }
}
