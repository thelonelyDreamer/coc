package com.felixwc.coc.pojo.coc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * in order to learn java!
 * created at 2021/11/21 11:23
 *
 * @author wangchao
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Member {
    private String tag;
    private String name;
    private String role;
    private int expLevel;
    private League league;
    private int trophies;
    private int versusTrophies;
    private int clanRank;
    private int previousClanRank;
    private int donations;
    private int donationsReceived;
}
