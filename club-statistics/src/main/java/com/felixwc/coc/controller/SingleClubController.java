package com.felixwc.coc.controller;

import com.felixwc.coc.config.ClubConfig;
import com.felixwc.coc.pojo.coc.Member;
import com.felixwc.coc.service.coc.SingleClubService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * in order to learn java!
 * created at 2021/11/21 14:26
 *
 * @author wangchao
 */
@Controller
@RequestMapping("club")
@AllArgsConstructor
public class SingleClubController {
    private SingleClubService singleClubService;
    private ClubConfig clubConfig;
    @GetMapping("/members")
    public String obtainMembers(Model model){
        List<Member> clubMember = singleClubService.getClubMember(clubConfig.getId());
        model.addAttribute("members",clubMember);
        return "members";
    }

    @GetMapping("/donate/{num}")
    public String donateTroops(Model model, @PathVariable int num){
        List<Member> clubMember = singleClubService.getClubMember(clubConfig.getId());
        clubMember.sort(new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return o2.getDonations()-o1.getDonations();
            }
        });
        clubMember.removeIf(new Predicate<Member>() {
            @Override
            public boolean test(Member member) {
                return member.getDonations()<num;
            }
        });
        model.addAttribute("members",clubMember);
        return "club/donatetroops";

    }
}
