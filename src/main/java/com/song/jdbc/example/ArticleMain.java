package com.song.jdbc.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArticleMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("chap02.xml");
        ArticleService articleService = ctx.getBean("articleService", com.song.jdbc.example.ArticleService.class);
        MemberService memberService = ctx.getBean("memberService", com.song.jdbc.example.MemberService.class);

        articleService.addArticle();
        memberService.registerMember();

        ctx.close();
    }

}
 