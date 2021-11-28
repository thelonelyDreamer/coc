package com.felixwc.coc.service.coc;

import com.felixwc.coc.pojo.coc.Member;

import java.util.List;

/**
 * in order to learn java!
 * created at 2021/11/21 11:20
 *
 * @author wangchao
 */
public interface SingleClubService {
    List<Member> getClubMember(String clubId);

}
