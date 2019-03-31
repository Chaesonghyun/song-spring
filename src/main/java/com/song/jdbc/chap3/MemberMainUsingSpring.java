package com.song.jdbc.chap3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MemberMainUsingSpring {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "chap3.xml");
        MemberRegisterService regService = ctx.getBean("memberRegisterService",
                MemberRegisterService.class);

        // registerRequest 초기화
        RegisterRequest req = new RegisterRequest();
        req.setEmail("song@gmail.com");
        req.setPassword("xxxx");
        req.setName("song");

        // 회원 등록
        regService.regist(req);
    }
}