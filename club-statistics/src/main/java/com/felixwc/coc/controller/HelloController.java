package com.felixwc.coc.controller;

import com.felixwc.coc.pojo.coc.Member;
import com.felixwc.coc.pojo.test.A;
import com.felixwc.coc.pojo.test.B;
import com.felixwc.coc.service.coc.ClubsService;
import com.felixwc.coc.service.coc.SingleClubService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/11/21 01:19
 *
 * @author wangchao
 */
@RestController
@RequestMapping("/test")
@AllArgsConstructor
public class HelloController {
    private final ClubsService clubsService;
    private final SingleClubService singleClubService;

    @GetMapping("/clubs")
    public String testClubs(){
        return  clubsService.getClubs();
    }

    @GetMapping("/club/members")
    public List<Member> obtainMember(){
        return singleClubService.getClubMember("%23299YQL9CU");
    }

    @GetMapping("/dependency")
    public A getA(){
        A a = new A();
        B b = new B();
        a.getList().add(b);
        b.getList().add(a);
        return a;
    }
}
