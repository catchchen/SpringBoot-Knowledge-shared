package com.ch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user/")
public class UserLoginController {
    @PostMapping("login")
    public ModelAndView login(ModelAndView model){
        model.setViewName("user/home");

        model.addObject("username","Tom");
        model.addObject("title","Knowledge");
        model.addObject("post_title","Knowledge");
        model.addObject("post_content","<h2 id=\"hello-halo\">Hello Halo</h2>\n" +
                "<p>如果你看到了这一篇文章，那么证明你已经安装成功了，感谢使用 <a href=\"https://halo.run\">Halo</a> 进行创作，希望能够使用愉快。</p>\n" +
                "<h2 id=\"相关链接\">相关链接</h2>\n" +
                "<ul>\n" +
                "<li>官网：<a href=\"https://halo.run\">https://halo.run</a></li>\n" +
                "<li>社区：<a href=\"https://bbs.halo.run\">https://bbs.halo.run</a></li>\n" +
                "<li>主题仓库：<a href=\"https://halo.run/p/themes.html\">https://halo.run/p/themes.html</a></li>\n" +
                "<li>开源地址：<a href=\"https://github.com/halo-dev/halo\">https://github.com/halo-dev/halo</a></li>\n" +
                "</ul>\n" +
                "<p>在使用过程中，有任何问题都可以通过以上链接找寻答案，或者联系我们。</p>\n" +
                "<blockquote>\n" +
                "<p>这是一篇自动生成的文章，请删除这篇文章之后开始你的创作吧！</p>\n" +
                "</blockquote>");

        return model;
    }
}
